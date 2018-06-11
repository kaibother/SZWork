package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.District;

public interface DistrictMapper {

    boolean deleteByPrimaryKey(Integer districtid);

    boolean insert(District record);

    District selectByPrimaryKey(Integer districtid);

    boolean updateByPrimaryKey(District record);

    /*根据区名查区id*/
    public District selectDistrictByDistricName(@Param("districtname") String districtname);
}