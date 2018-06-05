package pluto.dao;

import pluto.entity.ServiceDetail;

public interface ServiceDetailMapper {

    int deleteByPrimaryKey(Integer servicedetailid);

    int insert(ServiceDetail record);

    ServiceDetail selectByPrimaryKey(Integer servicedetailid);

    int updateByPrimaryKey(ServiceDetail record);
}