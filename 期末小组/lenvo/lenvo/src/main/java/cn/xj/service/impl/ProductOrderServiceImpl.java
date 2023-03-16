package cn.xj.service.impl;

import cn.xj.mapper.ProductOrderMapper;
import cn.xj.pojo.ProductOrder;
import cn.xj.pojo.ProductOrderExample;
import cn.xj.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {
    @Autowired
    ProductOrderMapper productOrderMapper;

    @Override
    public int add(ProductOrder productOrder) {
        return productOrderMapper.insert(productOrder);
    }

    @Override
    public int cancel(int id) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setStatus(1);
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andIdEqualTo(id);
        return productOrderMapper.updateByExampleSelective(productOrder,productOrderExample);
    }

    @Override
    public int deliverGoods(int id) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setStatus(2);
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andIdEqualTo(id);
        return productOrderMapper.updateByExampleSelective(productOrder,productOrderExample);
    }

    @Override
    public int accept(int id) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setStatus(3);
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andIdEqualTo(id);
        return productOrderMapper.updateByExampleSelective(productOrder,productOrderExample);
    }

    @Override
    public int comment(int id) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setStatus(4);
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andIdEqualTo(id);
        return productOrderMapper.updateByExampleSelective(productOrder,productOrderExample);
    }

    @Override
    public List<ProductOrder> getWait(int userid) {
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andUserIdEqualTo(userid).andStatusEqualTo(0);
        return productOrderMapper.selectByExample(productOrderExample);
    }

    @Override
    public List<ProductOrder> getCancel(int userid) {
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andUserIdEqualTo(userid).andStatusEqualTo(1);
        return productOrderMapper.selectByExample(productOrderExample);
    }

    @Override
    public List<ProductOrder> getDeliver(int userid) {
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andUserIdEqualTo(userid).andStatusEqualTo(2);
        return productOrderMapper.selectByExample(productOrderExample);
    }

    @Override
    public List<ProductOrder> getAccept(int userid) {
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andUserIdEqualTo(userid).andStatusEqualTo(3);
        return productOrderMapper.selectByExample(productOrderExample);
    }

    @Override
    public List<ProductOrder> getComment(int userid) {
        ProductOrderExample productOrderExample = new ProductOrderExample();
        productOrderExample.createCriteria().andUserIdEqualTo(userid).andStatusEqualTo(4);
        return productOrderMapper.selectByExample(productOrderExample);
    }
}
