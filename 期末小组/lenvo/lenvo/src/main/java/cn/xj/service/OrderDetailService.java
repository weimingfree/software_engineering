package cn.xj.service;

import cn.xj.pojo.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    //增加一份订单详情
    public int add(OrderDetail orderDetail);
    //批量增加订单详情
    public int addbatch(List<OrderDetail> orderDetails);
    //单项商品退货
    public int cancel1(int id);
    //整体订单退货
    public int cancel2(String code);
    //通过订单号拿到订单详情
    public List<OrderDetail> getByCode(String code);
}
