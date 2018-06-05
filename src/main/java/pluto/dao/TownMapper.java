package pluto.dao;

import pluto.entity.Town;

public interface TownMapper {

    int deleteByPrimaryKey(Integer townid);

    int insert(Town record);

    Town selectByPrimaryKey(Integer townid);

    int updateByPrimaryKey(Town record);
}