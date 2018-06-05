package pluto.dao;

import pluto.entity.Dog;

public interface DogMapper {

    int deleteByPrimaryKey(Integer dogid);

    int insert(Dog record);

    Dog selectByPrimaryKey(Integer dogid);

    int updateByPrimaryKey(Dog record);
}