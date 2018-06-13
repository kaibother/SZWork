package pluto.dao;

import pluto.entity.ActiveGrade;

import java.util.List;

public interface ActiveGradeMapper {
    //查询所有等级
    List<ActiveGrade> selectAllActiveGrade();

    ActiveGrade selectByActiveGrade(String activeGrade);
}