package pluto.dao;

import pluto.entity.UserConsumption;

import java.util.List;

public interface UserConsumptionMapper {

    //插入消费记录
    boolean insertUserConsumption(UserConsumption record);


    //更新消费记录
    boolean updateUserConsumption(UserConsumption userConsumption);

    /*查所有的消费记录根据用户id*/
    public List<UserConsumption> selectAllUserConsumption(Integer userid);
}