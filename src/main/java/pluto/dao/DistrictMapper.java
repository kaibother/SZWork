package pluto.dao;

import pluto.entity.District;

public interface DistrictMapper {

    int deleteByPrimaryKey(Integer districtid);

    int insert(District record);

    District selectByPrimaryKey(Integer districtid);

    int updateByPrimaryKey(District record);
}