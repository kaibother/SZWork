package pluto.dao;

import pluto.entity.Order;

public interface OrderMapper {

    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    Order selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKey(Order record);
}