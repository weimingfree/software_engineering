package cn.xj.controller;

import cn.xj.pojo.Car;
import cn.xj.pojo.Member;
import cn.xj.pojo.OrderDetail;
import cn.xj.pojo.ProductOrder;
import cn.xj.service.CarService;
import cn.xj.service.OrderDetailService;
import cn.xj.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/car")
public class car {
    @Autowired
    CarService carService;
    @Autowired
    ProductOrderService productOrderService;
    @Autowired
    OrderDetailService orderDetailService;
    //点击我的购物车
    @RequestMapping("/clickcar")
    public String clickcar(HttpSession session, HttpServletRequest request){
        Object object = session.getAttribute("user");
        if(object != null){
            Member member = (Member)object;
            int userid = member.getId();
            List<Car> carList = carService.showAll(userid);
            request.setAttribute("carlist",carList);
            return "car.jsp";
        }else{
            return "login.jsp";
        }
    }
    //加入商品到购物车
    @RequestMapping("/addtocar")
    public String addtocar(HttpServletRequest request,HttpSession session){
        System.out.println("test");
        Object object = session.getAttribute("user");
        if(object != null){
            Member member = (Member)object;
            int userid = member.getId();
            int product_id = Integer.parseInt(request.getParameter("product_id"));
            int num = Integer.parseInt(request.getParameter("num"));
            //此价格是最终的单价
            BigDecimal price = new BigDecimal(request.getParameter("price"));
            String total = request.getParameter("total");
            System.out.println(userid + " " + product_id + " " + num + " " + price + " " + total);
            Car car = new Car();
            car.setUserId(userid);car.setProductId(product_id);car.setNum(num);
            car.setPrice(price);car.setTotal(total);
            carService.add(car);
            request.setAttribute("msg","添加成功");
            return "main.jsp";
        }else{
            System.out.println("未登录");
            return "login.jsp";
        }
    }
    //单个删除购物车中的数据
    @RequestMapping("/delete")
    public void delete(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        carService.delete(id);
    }
    //批量删除购物车中的数据
    @RequestMapping("/deletebatch")
    public void deletebatch(HttpServletRequest request) {
        String[] _ids = request.getParameterValues("ids[]");
        Integer[] ids = new Integer[_ids.length];
        for(int i = 0;i < _ids.length;i++)
            System.out.println(_ids[i]);
        for(int i = 0;i < _ids.length;i++)ids[i] = Integer.valueOf(_ids[i]);
        carService.deleteBatch(Arrays.asList(ids));
    }


    private static String date;
    private static long orderNum = 0L;
    public static synchronized String getOrderNo(){
        String str = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
        if(date==null||!date.equals(str)){
            date = str;
            orderNum = 0L;
        }
        orderNum++;
        long orderNO = Long.parseLong(date)*10000;
        orderNO += orderNum;
        return orderNO+"";
    }
    //结算
    @RequestMapping("/settleaccounts")
    public void settleaccount(HttpServletRequest request,HttpSession session) {
        //将被选中的购物车条目从购物车中删除
        String [] _ids = request.getParameterValues("ids[]");
        Integer[] ids = new Integer[_ids.length];
        for(int i = 0;i < _ids.length;i++)ids[i] = Integer.valueOf(_ids[i]);
        carService.deleteBatch(Arrays.asList(ids));

        String [] _totals = request.getParameterValues("totals[]");
        String [] _product_ids = request.getParameterValues("product_ids[]");
        String [] _nums = request.getParameterValues("nums[]");

        //先建立订单
        String code = getOrderNo();
        Date date = new Date();
        Object object = session.getAttribute("user");
        Member member = (Member)object;
        int user_id = member.getId();
        Double total = 0.00;
        for(int i = 0;i < _totals.length;i++){
            total += Double.parseDouble(_totals[i]);
        }
        ProductOrder productOrder = new ProductOrder();
        productOrder.setUserId(user_id);
        productOrder.setCode(code);
        productOrder.setAddtime(date);
        productOrder.setTotal(total.toString());
        productOrder.setStatus(0);//新建待发货订单
        productOrderService.add(productOrder);

        //建立订单详情
        List<OrderDetail> orderDetailList = new ArrayList<>();
        for(int i = 0;i < _ids.length;i++){
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setNum(Integer.valueOf(_nums[i]));
            orderDetail.setProductId(Integer.valueOf(_product_ids[i]));
            orderDetail.setTotal(_totals[i]);
            orderDetail.setOrderId(code);
            orderDetail.setStatus(0);
            orderDetailList.add(orderDetail);
        }
        orderDetailService.addbatch(orderDetailList);

        request.setAttribute("msg","创建订单成功");
    }
}
