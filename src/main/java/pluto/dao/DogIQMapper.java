package pluto.dao;

import pluto.entity.DogIQ;

public interface DogIQMapper {

    int deleteByPrimaryKey(Integer dogiqid);

    int insert(DogIQ record);

    DogIQ selectByPrimaryKey(Integer dogiqid);

    int updateByPrimaryKey(DogIQ record);
}