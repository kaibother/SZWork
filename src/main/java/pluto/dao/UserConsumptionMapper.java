package pluto.dao;

import pluto.entity.UserConsumption;

public interface UserConsumptionMapper {

    int deleteByPrimaryKey(Integer consumptionid);

    int insert(UserConsumption record);

    UserConsumption selectByPrimaryKey(Integer consumptionid);

    int updateByPrimaryKey(UserConsumption record);
}