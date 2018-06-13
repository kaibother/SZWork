package pluto.dao;

import pluto.entity.ActiveType;

import java.util.List;

public interface ActiveTypeMapper {

    List<ActiveType>selectAllActivityType();

    ActiveType selectActiveTypeByName(String activename);
}