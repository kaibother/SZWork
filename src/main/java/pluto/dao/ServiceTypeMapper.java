package pluto.dao;

import pluto.entity.ServiceType;

public interface ServiceTypeMapper {

    int deleteByPrimaryKey(Integer servicetypeid);

    int insert(ServiceType record);

    ServiceType selectByPrimaryKey(Integer servicetypeid);

    int updateByPrimaryKey(ServiceType record);
}