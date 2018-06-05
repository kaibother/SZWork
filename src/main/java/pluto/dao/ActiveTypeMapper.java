package pluto.dao;

import pluto.entity.ActiveType;

public interface ActiveTypeMapper {

    int deleteByPrimaryKey(Integer activetypeid);

    int insert(ActiveType record);

    ActiveType selectByPrimaryKey(Integer activetypeid);


    int updateByPrimaryKey(ActiveType record);
}