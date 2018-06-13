package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Street;

public interface StreetMapper {

    /*根据街道名查街道id*/
    public Street selectStreetByStreetName(@Param("streetname") String streetname);
}