package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.City;

public interface CityMapper {

    /*根据市名查市id*/
    public City selectCityByCityName(@Param("cityname") String cityname);
}