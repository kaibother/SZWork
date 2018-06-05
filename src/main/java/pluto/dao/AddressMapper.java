package pluto.dao;

import pluto.entity.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addressid);

    int insert(Address record);

    Address selectByPrimaryKey(Integer addressid);

    int updateByPrimaryKey(Address record);
}