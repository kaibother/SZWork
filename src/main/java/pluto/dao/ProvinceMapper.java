package pluto.dao;

import org.apache.ibatis.annotations.Param;
import pluto.entity.Province;

public interface ProvinceMapper {
    /*根据省名查省id*/
    public Province selectProvinceByProvinceName(@Param("provincename") String provincename);
}