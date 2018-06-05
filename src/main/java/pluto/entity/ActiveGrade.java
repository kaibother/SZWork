package pluto.entity;

public class ActiveGrade {
    private Integer activegradeid;

    private String acticegrade;

    private Double activeprice;

    public Integer getActivegradeid() {
        return activegradeid;
    }

    public void setActivegradeid(Integer activegradeid) {
        this.activegradeid = activegradeid;
    }

    public String getActicegrade() {
        return acticegrade;
    }

    public void setActicegrade(String acticegrade) {
        this.acticegrade = acticegrade == null ? null : acticegrade.trim();
    }

    public Double getActiveprice() {
        return activeprice;
    }

    public void setActiveprice(Double activeprice) {
        this.activeprice = activeprice;
    }
}