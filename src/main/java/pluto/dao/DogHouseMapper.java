package pluto.dao;

import pluto.entity.DogHouse;

import java.util.List;


public interface DogHouseMapper {
    List<DogHouse> selectAllHouse();
    DogHouse selectHouseById(Integer doghouseid);
    List<DogHouse>selectDogHouseNameByGrade(Integer doghousegradeid);
    List<DogHouse>selectDogHouseNameBySize(Integer dogsizeid);
    List<DogHouse>selectDogHouseNameByGradeAndSize(Integer doghousegradeid,Integer dogsizeid);
}