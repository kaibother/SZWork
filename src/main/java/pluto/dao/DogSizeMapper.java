package pluto.dao;

import pluto.entity.DogSize;

public interface DogSizeMapper {

    int deleteByPrimaryKey(Integer dogsizeid);

    int insert(DogSize record);

    DogSize selectByPrimaryKey(Integer dogsizeid);

    int updateByPrimaryKey(DogSize record);
}