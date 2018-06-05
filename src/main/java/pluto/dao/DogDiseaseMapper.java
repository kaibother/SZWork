package pluto.dao;

import pluto.entity.DogDisease;

public interface DogDiseaseMapper {

    int deleteByPrimaryKey(Integer dogdiseaseid);

    int insert(DogDisease record);

    DogDisease selectByPrimaryKey(Integer dogdiseaseid);

    int updateByPrimaryKey(DogDisease record);
}