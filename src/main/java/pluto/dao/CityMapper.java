package pluto.dao;

import pluto.entity.City;

public interface CityMapper {

    int deleteByPrimaryKey(Integer cityid);

    int insert(City record);

    City selectByPrimaryKey(Integer cityid);


    int updateByPrimaryKey(City record);
}