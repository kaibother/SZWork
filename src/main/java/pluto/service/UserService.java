package pluto.service;

import pluto.entity.Address;
import pluto.entity.Order;
import pluto.entity.User;
import pluto.entity.UserConsumption;

import java.util.List;

public interface UserService {
    //账户余额查询
    Double QueryBalance(int userid);
    //消费记录查询
    List<UserConsumption>QueryConsumption(int userid);
    //余额充值
    boolean BalanceRecharge(int userid,Double rechargeamount);
    //订单查询（用户查自己的订单信息）
    List<Order>QueryOrder(int userid);
    //移除收货地址
    boolean RemoveDeliveryAddress(int userid);

    boolean ModifyDeliverAddress(Address address);

    boolean AddDeliverAddress(Address address);

    User QueryUserInfo(int userid);
    //头像隶属于个人中心信息，故不单独分方法
    boolean ModifyUserInfo(User user);

}
