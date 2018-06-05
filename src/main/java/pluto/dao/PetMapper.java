package pluto.dao;

import pluto.entity.Pet;

public interface PetMapper {

    int deleteByPrimaryKey(Integer petid);

    int insert(Pet record);

    Pet selectByPrimaryKey(Integer petid);

    int updateByPrimaryKey(Pet record);
}