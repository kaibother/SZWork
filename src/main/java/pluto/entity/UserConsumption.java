package pluto.entity;

public class UserConsumption {
    private Integer consumptionid;

    private Double consumptionamount;

    private Integer userid;

    private Double rechargeamount;

    public Integer getConsumptionid() {
        return consumptionid;
    }

    public void setConsumptionid(Integer consumptionid) {
        this.consumptionid = consumptionid;
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
}