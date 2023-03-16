package cn.xj.service.impl;

import cn.xj.mapper.ProductMapper;
import cn.xj.pojo.Product;
import cn.xj.pojo.ProductExample;
import cn.xj.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;


    //查询商品一级类目
    @Override
    public List<Product> SelectFirstCategory() {
        ProductExample example = new ProductExample();
        example.createCriteria().andIsdeleteEqualTo(0).andCategoryId2EqualTo(0);
        return productMapper.selectByExample(example);
    }

    //根据商品一级类目查询商品二级类目
    @Override
    public List<Product> SelectSecondCategory(Product father) {
        ProductExample example = new ProductExample();
        example.createCriteria().andCategoryId1EqualTo(father.getId()).andIsdeleteEqualTo(0).andCategoryId2NotEqualTo(0);
        return productMapper.selectByExample(example);
    }

    //模糊查询结果分页
    @Override
    public PageInfo splitPageFuzzyQuery(int pageNum, int pageSize,String name) {
        PageHelper.startPage(pageNum,pageSize);
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andNameLike("%" + name + "%");
        List<Product> list = productMapper.selectByExample(productExample);
        PageInfo<Product> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Product queryById(int id) {
        return productMapper.selectByPrimaryKey(id);
    }

    //更新商品
    @Override
    public int update(Product product) {
        return productMapper.updateByPrimaryKey(product);
    }
    //删除商品
    @Override
    public int delete(int id) {
        return productMapper.deleteByPrimaryKey(id);
    }
    //增加商品
    @Override
    public int add(Product product) {
        return productMapper.insert(product);
    }


}
