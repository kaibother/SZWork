package pluto.dao;

import pluto.entity.Street;

public interface StreetMapper {

    int deleteByPrimaryKey(Integer streetid);

    int insert(Street record);

    Street selectByPrimaryKey(Integer streetid);

    int updateByPrimaryKey(Street record);
}