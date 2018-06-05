package pluto.dao;

import pluto.entity.DogHouseGrade;

public interface DogHouseGradeMapper {

    int deleteByPrimaryKey(Integer doghousegradeid);

    int insert(DogHouseGrade record);

    DogHouseGrade selectByPrimaryKey(Integer doghousegradeid);

    int updateByPrimaryKey(DogHouseGrade record);
}