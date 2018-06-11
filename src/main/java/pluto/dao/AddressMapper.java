package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Address;

import java.util.List;

public interface AddressMapper {
    boolean  deleteByPrimaryKey(Integer addressid);

    boolean insert(Address record);

    Address selectByPrimaryKey(Integer addressid);

    boolean updateByPrimaryKey(Address record);

    /*根据用户id来查询用户地址*/
    public List<Address> selectUserAddress(@Param("userid") Integer userid);

    /*用户插入地址*/
    public boolean insertUserAddress(@Param("address") Address address);

}