package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.District;

public interface DistrictMapper {

    /*根据区名查区id*/
    public District selectDistrictByDistricName(@Param("districtname") String districtname);
}