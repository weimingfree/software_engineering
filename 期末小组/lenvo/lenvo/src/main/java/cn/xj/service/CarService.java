package cn.xj.service;

import cn.xj.pojo.Car;

import java.util.List;

public interface CarService {
    //根据用户id显示购物车中的信息
    public List<Car> showAll(int userid);

    //向购物车中增加一项商品
    public int add(Car car);

    //删除购物车中的一项商品
    public int delete(int id);

    //批量删除购物车中的商品
    public int deleteBatch(List<Integer> ids);

    //根据用户id清空此用户的购物车
    public int clear(int userid);


}
