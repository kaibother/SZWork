package pluto.dao;

import pluto.entity.DogWeight;

public interface DogWeightMapper {

    int deleteByPrimaryKey(Integer digweightid);

    int insert(DogWeight record);

    DogWeight selectByPrimaryKey(Integer digweightid);

    int updateByPrimaryKey(DogWeight record);
}