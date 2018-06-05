package pluto.dao;

import pluto.entity.HospitalInfo;

public interface HospitalInfoMapper {

   int deleteByPrimaryKey(Integer hospitalid);

    int insert(HospitalInfo record);

    HospitalInfo selectByPrimaryKey(Integer hospitalid);

    int updateByPrimaryKey(HospitalInfo record);
}