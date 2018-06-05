package pluto.entity;

public class ServiceDetail {
    private Integer servicedetailid;

    private Integer servicecount;

    private Double oneservicecountprice;

    private Integer orderid;

    private Integer servicetypeid;

    public Integer getServicedetailid() {
        return servicedetailid;
    }

    public void setServicedetailid(Integer servicedetailid) {
        this.servicedetailid = servicedetailid;
    }

    public Integer getServicecount() {
        return servicecount;
    }

    public void setServicecount(Integer servicecount) {
        this.servicecount = servicecount;
    }

    public Double getOneservicecountprice() {
        return oneservicecountprice;
    }

    public void setOneservicecountprice(Double oneservicecountprice) {
        this.oneservicecountprice = oneservicecountprice;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getServicetypeid() {
        return servicetypeid;
    }

    public void setServicetypeid(Integer servicetypeid) {
        this.servicetypeid = servicetypeid;
    }
}