package pluto.dao;

import pluto.entity.PayWay;

public interface PayWayMapper {

    boolean deleteByPayWayId(Integer paywayid);

    boolean insert(PayWay record);
    PayWay selectByPayWayId(Integer paywayid);

    boolean updateByPayWayId(PayWay record);
}