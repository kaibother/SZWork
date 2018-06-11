package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Province;

public interface ProvinceMapper {

    boolean deleteByPrimaryKey(Integer provinceid);

    boolean insert(Province record);

    Province selectByPrimaryKey(Integer provinceid);

    boolean updateByPrimaryKey(Province record);

    /*根据省名查省id*/
    public Province selectProvinceByProvinceName(@Param("provincename") String provincename);
}