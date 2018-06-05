package pluto.dao;

import pluto.entity.DogDiseaseDeal;

public interface DogDiseaseDealMapper {

    int deleteByPrimaryKey(Integer dogdiseasedealid);

    int insert(DogDiseaseDeal record);

    DogDiseaseDeal selectByPrimaryKey(Integer dogdiseasedealid);

    int updateByPrimaryKey(DogDiseaseDeal record);
}