package cn.xj.service;

import cn.xj.pojo.Product;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductService {
    //查询商品的一级类目
    List<Product> SelectFirstCategory();
    //查询商品的二级类目
    List<Product> SelectSecondCategory(Product father);
    //模糊查询得到商品的分页结果
    PageInfo splitPageFuzzyQuery(int pageNum, int pageSize,String name);
    //根据商品id得到商品的所有信息
    Product queryById(int id);
    //更新商品
    public int update(Product product);
    //删除商品
    public int delete(int id);
    //增加商品
    public int add(Product product);
}
