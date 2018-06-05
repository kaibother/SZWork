package pluto.dao;

import pluto.entity.PayWay;

public interface PayWayMapper {

    int deleteByPrimaryKey(Integer paywayid);

    int insert(PayWay record);

    PayWay selectByPrimaryKey(Integer paywayid);

    int updateByPrimaryKey(PayWay record);
}