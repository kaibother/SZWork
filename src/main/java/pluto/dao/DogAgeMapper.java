package pluto.dao;

import pluto.entity.DogAge;

public interface DogAgeMapper {

    int deleteByPrimaryKey(Integer dogeageid);

    int insert(DogAge record);

    DogAge selectByPrimaryKey(Integer dogeageid);

    int updateByPrimaryKey(DogAge record);
}