package pluto.service;
import pluto.entity.ActiveGrade;
import pluto.entity.ActiveSignUp;
import pluto.entity.ActiveType;

import java.util.Date;
import java.util.List;

public interface ActivityService {

    List<ActiveType>queryAllActivityType();

    ActiveType queryActiveTypeByName(String activename);

    //查询所有活动等级
    List<ActiveGrade> queryAllActiveGrade();


    ActiveGrade queryByActiveGrade(String activeGrade);


    //按照userid查询登记记录
    List<ActiveSignUp> querySignUpByUserId(int userId);


    //按照活动日期查询活动
    List<ActiveSignUp>querySignUpByActivedate(Date activedate);


    //添加活动登记
    boolean addActiveSignUp(ActiveSignUp activeSignUp);


    //修改活动登记
    boolean modifyActiveSignUp(ActiveSignUp activeSignUp);


    //删除活动登记
    boolean removeActiveSignUp(int signupid);
}
