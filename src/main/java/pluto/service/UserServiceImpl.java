package pluto.service;

import pluto.entity.Address;
import pluto.entity.Order;
import pluto.entity.User;
import pluto.entity.UserConsumption;

import java.util.List;

public class UserServiceImpl implements UserService {
    public Double QueryBalance(int userid) {
        return null;
    }

    public List<UserConsumption> QueryConsumption(int userid) {
        return null;
    }

    public boolean BalanceRecharge(int userid, Double rechargeamount) {
        return false;
    }

    public List<Order> QueryOrder(int userid) {
        return null;
    }

    public boolean RemoveDeliveryAddress(int userid) {
        return false;
    }

    public boolean ModifyDeliverAddress(Address address) {
        return false;
    }

    public boolean AddDeliverAddress(Address address) {
        return false;
    }

    public User QueryUserInfo(int userid) {
        return null;
    }

    public boolean ModifyUserInfo(User user) {
        return false;
    }
}
