package pluto.dao;

import pluto.entity.Cart;

public interface CartMapper {

    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart record);

    Cart selectByPrimaryKey(Integer cartid);

    int updateByPrimaryKey(Cart record);
}