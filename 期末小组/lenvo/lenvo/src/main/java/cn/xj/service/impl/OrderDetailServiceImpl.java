package cn.xj.service.impl;

import cn.xj.mapper.OrderDetailMapper;
import cn.xj.pojo.OrderDetail;
import cn.xj.pojo.OrderDetailExample;
import cn.xj.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    OrderDetailMapper orderDetailMapper;
    @Override
    public int add(OrderDetail orderDetail) {
        return orderDetailMapper.insert(orderDetail);
    }
    @Override
    public int addbatch(List<OrderDetail> orderDetails) {
        int flag = -1;
        for(int i = 0;i < orderDetails.size();i++){
            if(flag == orderDetailMapper.insert(orderDetails.get(i)))
                return flag;
        }
        return 1;
    }
    //单项商品退货
    @Override
    public int cancel1(int id) {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setStatus(1);
        OrderDetailExample orderDetailExample = new OrderDetailExample();
        orderDetailExample.createCriteria().andIdEqualTo(id);
        orderDetailMapper.updateByExampleSelective(orderDetail,orderDetailExample);
        return 1;
    }
    //整体商品退货
    @Override
    public int cancel2(String code) {
        OrderDetailExample orderDetailExample = new OrderDetailExample();
        orderDetailExample.createCriteria().andOrderIdEqualTo(code);
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setStatus(1);
        orderDetailMapper.updateByExampleSelective(orderDetail,orderDetailExample);
        return 1;
    }
    //通过订单号得到订单详情
    public List<OrderDetail> getByCode(String code){
        OrderDetailExample orderDetailExample = new OrderDetailExample();
        orderDetailExample.createCriteria().andOrderIdEqualTo(code).andStatusEqualTo(0);//尚未被删除的
        return orderDetailMapper.selectByExample(orderDetailExample);
    }

}
