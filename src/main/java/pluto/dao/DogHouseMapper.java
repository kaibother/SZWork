package pluto.dao;

import pluto.entity.DogHouse;

public interface DogHouseMapper {

    int deleteByPrimaryKey(Integer doghouseid);

    int insert(DogHouse record);

    DogHouse selectByPrimaryKey(Integer doghouseid);

    int updateByPrimaryKey(DogHouse record);
}