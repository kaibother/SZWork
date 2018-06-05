package pluto.entity;

public class FosterDetail {
    private Integer fosterdetailid;

    private Integer fosterday;

    private Double fostertotalprice;

    private Integer doghousegradeid;

    private Integer petid;

    public Integer getFosterdetailid() {
        return fosterdetailid;
    }

    public void setFosterdetailid(Integer fosterdetailid) {
        this.fosterdetailid = fosterdetailid;
    }

    public Integer getFosterday() {
        return fosterday;
    }

    public void setFosterday(Integer fosterday) {
        this.fosterday = fosterday;
    }

    public Double getFostertotalprice() {
        return fostertotalprice;
    }

    public void setFostertotalprice(Double fostertotalprice) {
        this.fostertotalprice = fostertotalprice;
    }

    public Integer getDoghousegradeid() {
        return doghousegradeid;
    }

    public void setDoghousegradeid(Integer doghousegradeid) {
        this.doghousegradeid = doghousegradeid;
    }

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }
}