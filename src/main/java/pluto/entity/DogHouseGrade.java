package pluto.entity;

public class DogHouseGrade {
    private Integer doghousegradeid;

    private String doghousegrade;

    private Double doghousevipprice;

    private Double doghouseprice;

    public Integer getDoghousegradeid() {
        return doghousegradeid;
    }

    public void setDoghousegradeid(Integer doghousegradeid) {
        this.doghousegradeid = doghousegradeid;
    }

    public String getDoghousegrade() {
        return doghousegrade;
    }

    public void setDoghousegrade(String doghousegrade) {
        this.doghousegrade = doghousegrade == null ? null : doghousegrade.trim();
    }

    public Double getDoghousevipprice() {
        return doghousevipprice;
    }

    public void setDoghousevipprice(Double doghousevipprice) {
        this.doghousevipprice = doghousevipprice;
    }

    public Double getDoghouseprice() {
        return doghouseprice;
    }

    public void setDoghouseprice(Double doghouseprice) {
        this.doghouseprice = doghouseprice;
    }
}