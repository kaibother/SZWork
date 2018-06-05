package pluto.entity;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Date orderdate;

    private Double totalprice;

    private String orderstatus;

    private Integer paywayid;

    private Integer userid;

    private Integer userconsumptionid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public Integer getPaywayid() {
        return paywayid;
    }

    public void setPaywayid(Integer paywayid) {
        this.paywayid = paywayid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserconsumptionid() {
        return userconsumptionid;
    }

    public void setUserconsumptionid(Integer userconsumptionid) {
        this.userconsumptionid = userconsumptionid;
    }
}