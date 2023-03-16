package cn.xj.service.impl;

import cn.xj.mapper.CarMapper;
import cn.xj.pojo.Car;
import cn.xj.pojo.CarExample;
import cn.xj.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarMapper carMapper;
    //根据用户的id显示此用户的购物车记录
    @Override
    public List<Car> showAll(int userid) {
        CarExample carExample = new CarExample();
        carExample.createCriteria().andUserIdEqualTo(userid);
        return carMapper.selectByExample(carExample);
    }


    //向购物车添加一项记录
    @Override
    public int add(Car car) {
        CarExample example = new CarExample();
        example.createCriteria().andProductIdEqualTo(car.getProductId());
        List<Car> cars= carMapper.selectByExample(example);
        if(cars.size() == 0){
            return carMapper.insert(car);
        }else{
            Car record = new Car();
            record.setNum(car.getNum() + cars.get(0).getNum());
            record.setTotal(String.valueOf(car.getPrice() * Double.valueOf(record.getNum())));
            record.setPrice(BigDecimal.valueOf(car.getPrice()));
            CarExample carExample = new CarExample();
            carExample.createCriteria().andProductIdEqualTo(car.getProductId());
            return carMapper.updateByExampleSelective(record,carExample);
        }
    }

    //删除购物车中的一项记录
    @Override
    public int delete(int id) {
        return carMapper.deleteByPrimaryKey(id);
    }

    //批量删除购物车中的记录
    @Override
    public int deleteBatch(List<Integer> ids) {
        CarExample carExample = new CarExample();
        carExample.createCriteria().andIdIn(ids);
        return carMapper.deleteByExample(carExample);
    }

    //清空购物车中的某一用户的所有记录
    @Override
    public int clear(int userid) {
        CarExample carExample = new CarExample();
        carExample.createCriteria().andUserIdEqualTo(userid);
        return carMapper.deleteByExample(carExample);
    }
}
