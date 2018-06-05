package pluto.entity;

public class ServiceGrade {
    private Integer servicegradeid;

    private Double serviceprice;

    private Double dogweight;

    private Double vipprice;

    public Integer getServicegradeid() {
        return servicegradeid;
    }

    public void setServicegradeid(Integer servicegradeid) {
        this.servicegradeid = servicegradeid;
    }

    public Double getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(Double serviceprice) {
        this.serviceprice = serviceprice;
    }

    public Double getDogweight() {
        return dogweight;
    }

    public void setDogweight(Double dogweight) {
        this.dogweight = dogweight;
    }

    public Double getVipprice() {
        return vipprice;
    }

    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }
}