package cn.xj.controller;

import cn.xj.pojo.Member;
import cn.xj.pojo.OrderDetail;
import cn.xj.pojo.ProductOrder;
import cn.xj.service.OrderDetailService;
import cn.xj.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class Order {
    @Autowired
    ProductOrderService productOrderService;
    @Autowired
    OrderDetailService orderDetailService;
    //得到用户的订单列表
    @RequestMapping("/getlist")
    public String getlist(HttpServletRequest request, HttpSession session){
        Object object = session.getAttribute("user");
        Member member = (Member)object;
        int userid = member.getId();
        int type = Integer.parseInt(request.getParameter("type"));
        List<ProductOrder> productOrderList = new ArrayList<>();
        if(type == 0) {
            productOrderList = productOrderService.getWait(userid);
            request.setAttribute("orderlist", productOrderList);
        }else if(type == 1){
            productOrderList = productOrderService.getCancel(userid);
            request.setAttribute("orderlist", productOrderList);
        }else if(type == 2){
            productOrderList = productOrderService.getDeliver(userid);
            request.setAttribute("orderlist", productOrderList);
        }else if(type == 3){
            productOrderList = productOrderService.getAccept(userid);
            request.setAttribute("orderlist", productOrderList);
        }else if(type == 4){
            productOrderList = productOrderService.getComment(userid);
            request.setAttribute("orderlist", productOrderList);
        }
        return "test.jsp";
    }
    //通过订单号得动订单详情
    @RequestMapping("/getByCode")
    public String getByCode(HttpServletRequest request){
        String code = request.getParameter("code");
        List<OrderDetail> orderDetailList = new ArrayList<>();
        orderDetailList = orderDetailService.getByCode(code);
        request.setAttribute("orderlist",orderDetailList);
        return "test.jsp";
    }
    //单个取消某个商品
    @RequestMapping("/cancel1")
    public void cancel1(HttpServletRequest request){
        //此id为订单详情里一个元组的id
        int id = Integer.parseInt(request.getParameter("id"));
        orderDetailService.cancel1(id);
    }
    //取消整个订单
    @RequestMapping("/cancel2")
    public void cancel2(HttpServletRequest request){
        //此id为订单的id
        int id = Integer.parseInt(request.getParameter("id"));
        String code = request.getParameter("code");
        orderDetailService.cancel2(code);
        productOrderService.cancel(id);
    }

    //订单已发送
    @RequestMapping("/deliver")
    public void deliver(HttpServletRequest request){
        //此id为的id
        int id = Integer.parseInt(request.getParameter("id"));
        String code = request.getParameter("code");
        productOrderService.deliverGoods(id);
    }
    //订单已收获
    @RequestMapping("/accept")
    public void accept(HttpServletRequest request){
        //此id为的id
        int id = Integer.parseInt(request.getParameter("id"));
        String code = request.getParameter("code");
        productOrderService.accept(id);
    }

    //订单已评论
    @RequestMapping("/comment")
    public void comment(HttpServletRequest request){
        //此id为的id
        int id = Integer.parseInt(request.getParameter("id"));
        String code = request.getParameter("code");
        productOrderService.comment(id);
    }
}
