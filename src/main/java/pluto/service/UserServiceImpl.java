package pluto.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pluto.dao.UserConsumptionMapper;
import pluto.dao.UserMapper;
import pluto.entity.User;
import pluto.entity.UserConsumption;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserConsumptionMapper userConsumptionMapper;

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean addUserConsumption(UserConsumption record) {
        return userConsumptionMapper.insertUserConsumption(record);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean modifyUserConsumption(UserConsumption userConsumption) {
        return userConsumptionMapper.updateUserConsumption(userConsumption);
    }

    public List<UserConsumption> queryAllUserConsumption(Integer userid) {
        return userConsumptionMapper.selectAllUserConsumption(userid);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean addUser(User user) {
        return userMapper.insertUser(user);
    }

    public User queryByUserId(Integer userid) {
        return userMapper.selectByUserId(userid);
    }

    public String checkUserVip(Integer userid) {
        return userMapper.checkUserVip(userid);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean modifyUserinfo(User user) {
        return userMapper.updateUserinfo(user);
    }
}
