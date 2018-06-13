package pluto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pluto.dao.*;
import pluto.entity.ActiveGrade;
import pluto.entity.ActiveSignUp;
import pluto.entity.ActiveType;

import java.util.Date;
import java.util.List;


@Service
public class ActivityServiceImpl implements ActivityService{


    @Autowired
    private ActiveGradeMapper activeGradeMapper;
    @Autowired
    private ActiveTypeMapper activeTypeMapper;
    @Autowired
    private ActiveSignUpMapper activeSignUpMapper;


    public List<ActiveType> queryAllActivityType() {
        return activeTypeMapper.selectAllActivityType();
    }

    public ActiveType queryActiveTypeByName(String activename) {
        return activeTypeMapper.selectActiveTypeByName(activename);
    }

    //查询所有活动等级
    public List<ActiveGrade> queryAllActiveGrade() {
        return activeGradeMapper.selectAllActiveGrade();
    }

    public ActiveGrade queryByActiveGrade(String activeGrade) {
        return activeGradeMapper.selectByActiveGrade(activeGrade);
    }

    //按照userid查询登记记录
    public List<ActiveSignUp> querySignUpByUserId(int userId) {
        return activeSignUpMapper.selectSignUpByUserId(userId);
    }
    //按照活动日期查询活动
    public List<ActiveSignUp> querySignUpByActivedate(Date activedate) {
        return activeSignUpMapper.selectSignUpByActivedate(activedate);
    }
    //添加活动登记
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean addActiveSignUp(ActiveSignUp activeSignUp) {
        return activeSignUpMapper.insertActiveSignUp(activeSignUp);
    }
    //修改活动登记
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean modifyActiveSignUp(ActiveSignUp activeSignUp) {
        return activeSignUpMapper.updateActiveSignUp(activeSignUp);
    }
    //删除活动登记
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean removeActiveSignUp(int signupid) {
        return activeSignUpMapper.deleteActiveSignUp(signupid);
    }
}
