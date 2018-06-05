package pluto.dao;

import pluto.entity.ActiveGrade;

public interface ActiveGradeMapper {
    int deleteByPrimaryKey(Integer activegradeid);
    int insert(ActiveGrade record);
    ActiveGrade selectByPrimaryKey(Integer activegradeid);
    int updateByPrimaryKey(ActiveGrade record);
}