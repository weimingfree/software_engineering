package cn.xj.service;

import cn.xj.pojo.ProductOrder;

import java.util.List;

public interface ProductOrderService {
    //新建一个订单
    public int add(ProductOrder productOrder);
    //取消订单
    public int cancel(int id);

    //订单发货
    public int deliverGoods(int id);
    //订单收货
    public int accept(int id);
    //订单评价
    public int comment(int id);

    //通过用户id得到新建待发货订单列表
    public List<ProductOrder> getWait(int userid);
    //通过用户id得到已取消订单列表
    public List<ProductOrder> getCancel(int userid);
    //通过用户id得到已发送订单列表
    public List<ProductOrder> getDeliver(int userid);
    //通过用户id得到已接收订单列表
    public List<ProductOrder> getAccept(int userid);
    //通过用户id得到已评论订单列表
    public List<ProductOrder> getComment(int userid);
}
