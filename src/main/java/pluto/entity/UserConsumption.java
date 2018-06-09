package pluto.entity;

public class UserConsumption {
    private Integer userconsumptionid;

    private Double consumptionamount;

    private Integer userid;

    private Double rechargeamount;

    @Override
    public String toString() {
        return "UserConsumption{" +
                "userconsumptionid=" + userconsumptionid +
                ", consumptionamount=" + consumptionamount +
                ", userid=" + userid +
                ", rechargeamount=" + rechargeamount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserConsumption that = (UserConsumption) o;

        if (!userconsumptionid.equals(that.userconsumptionid)) return false;
        if (!consumptionamount.equals(that.consumptionamount)) return false;
        if (!userid.equals(that.userid)) return false;
        return rechargeamount.equals(that.rechargeamount);
    }

    @Override
    public int hashCode() {
        int result = userconsumptionid.hashCode();
        result = 31 * result + consumptionamount.hashCode();
        result = 31 * result + userid.hashCode();
        result = 31 * result + rechargeamount.hashCode();
        return result;
    }

    public Integer getUserconsumptionid() {

        return userconsumptionid;
    }

    public void setUserconsumptionid(Integer userconsumptionid) {
        this.userconsumptionid = userconsumptionid;
    }

    public Double getConsumptionamount() {
        return consumptionamount;
    }

    public void setConsumptionamount(Double consumptionamount) {
        this.consumptionamount = consumptionamount;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getRechargeamount() {
        return rechargeamount;
    }

    public void setRechargeamount(Double rechargeamount) {
        this.rechargeamount = rechargeamount;
    }

    public UserConsumption(Double consumptionamount, Integer userid, Double rechargeamount) {

        this.consumptionamount = consumptionamount;
        this.userid = userid;
        this.rechargeamount = rechargeamount;
    }

    public UserConsumption(Integer userconsumptionid, Double consumptionamount, Integer userid, Double rechargeamount) {

        this.userconsumptionid = userconsumptionid;
        this.consumptionamount = consumptionamount;
        this.userid = userid;
        this.rechargeamount = rechargeamount;
    }

    public UserConsumption() {

    }
}