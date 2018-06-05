package pluto.dao;

import pluto.entity.Province;

public interface ProvinceMapper {

    int deleteByPrimaryKey(Integer provinceid);

    int insert(Province record);

    Province selectByPrimaryKey(Integer provinceid);

    int updateByPrimaryKey(Province record);
}