package pluto.dao;

import pluto.entity.Brand;

public interface BrandMapper {

    int deleteByPrimaryKey(Integer brandid);

    int insert(Brand record);

    Brand selectByPrimaryKey(Integer brandid);


    int updateByPrimaryKey(Brand record);
}