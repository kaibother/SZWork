package pluto.dao;

import pluto.entity.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
}