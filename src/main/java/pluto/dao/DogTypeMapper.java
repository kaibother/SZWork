package pluto.dao;

import pluto.entity.DogType;

public interface DogTypeMapper {

    int deleteByPrimaryKey(Integer digtypeid);

    int insert(DogType record);

    DogType selectByPrimaryKey(Integer digtypeid);

    int updateByPrimaryKey(DogType record);
}