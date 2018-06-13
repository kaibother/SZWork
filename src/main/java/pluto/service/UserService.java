package pluto.service;

import org.apache.ibatis.annotations.Param;

import pluto.entity.User;
import pluto.entity.UserConsumption;

import java.util.List;

public interface UserService {

    //插入消费记录
    boolean addUserConsumption(UserConsumption record);


    //更新消费记录
    boolean modifyUserConsumption(UserConsumption userConsumption);

    /*查所有的消费记录根据用户id*/
    public List<UserConsumption> queryAllUserConsumption(Integer userid);


    /*用户插入信息*/
    public boolean addUser(User user);
    /*根据用户id查询用户*/
    public User queryByUserId(Integer userid);
    /*查看用户是否是vip*/
    public String checkUserVip(Integer userid);
    /*用户修改信息*/
    public boolean modifyUserinfo(User user);

}
