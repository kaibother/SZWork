package pluto.entity;

public class ActiveGrade {
    private Integer activegradeid;

    private String activegrade;

    private Double activeprice;

    public Integer getActivegradeid() {
        return activegradeid;
    }

    public void setActivegradeid(Integer activegradeid) {
        this.activegradeid = activegradeid;
    }

    public String getActicegrade() {
        return activegrade;
    }

    public void setActicegrade(String acticegrade) {
        this.activegrade = acticegrade == null ? null : acticegrade.trim();
    }

    public Double getActiveprice() {
        return activeprice;
    }

    public void setActiveprice(Double activeprice) {
        this.activeprice = activeprice;
    }
}