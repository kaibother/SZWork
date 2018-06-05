package pluto.dao;

import pluto.entity.ActiveSignUp;

public interface ActiveSignUpMapper {

    int deleteByPrimaryKey(Integer signupid);

    int insert(ActiveSignUp record);

    ActiveSignUp selectByPrimaryKey(Integer signupid);

    int updateByPrimaryKey(ActiveSignUp record);
}