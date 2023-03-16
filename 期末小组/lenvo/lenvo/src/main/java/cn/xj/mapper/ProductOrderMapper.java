package cn.xj.mapper;

import cn.xj.pojo.ProductOrder;
import cn.xj.pojo.ProductOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductOrderMapper {
    int countByExample(ProductOrderExample example);

    int deleteByExample(ProductOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductOrder record);

    int insertSelective(ProductOrder record);

    List<ProductOrder> selectByExample(ProductOrderExample example);

    ProductOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductOrder record, @Param("example") ProductOrderExample example);

    int updateByExample(@Param("record") ProductOrder record, @Param("example") ProductOrderExample example);

    int updateByPrimaryKeySelective(ProductOrder record);

    int updateByPrimaryKey(ProductOrder record);
}