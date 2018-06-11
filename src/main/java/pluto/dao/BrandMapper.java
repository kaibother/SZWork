package pluto.dao;

import pluto.entity.Brand;

public interface BrandMapper {

    boolean deleteByBrandId(Integer brandid);

    boolean insert(Brand record);

    Brand selectByBrandId(Integer brandid);


    boolean updateByBrandId(Brand record);
}