package pluto.dao;

import pluto.entity.ServiceGrade;

public interface ServiceGradeMapper {

    int deleteByPrimaryKey(Integer servicegradeid);

    int insert(ServiceGrade record);

    ServiceGrade selectByPrimaryKey(Integer servicegradeid);

    int updateByPrimaryKey(ServiceGrade record);
}