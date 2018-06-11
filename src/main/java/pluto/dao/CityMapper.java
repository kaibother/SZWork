package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.City;

public interface CityMapper {

    boolean deleteByPrimaryKey(Integer cityid);

    boolean insert(City record);

    City selectByPrimaryKey(Integer cityid);

    boolean updateByPrimaryKey(City record);

    /*根据市名查市id*/
    public City selectCityByCityName(@Param("cityname") String cityname);
}