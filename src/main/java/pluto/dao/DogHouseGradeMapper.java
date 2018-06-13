package pluto.dao;

import pluto.entity.DogHouseGrade;

import java.util.List;

public interface DogHouseGradeMapper {

    List<DogHouseGrade> selectAllDogHouseGrade();
    DogHouseGrade selectDogHouseGradeById(Integer doghousegradeid);

}