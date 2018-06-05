package pluto.entity;

public class PayWay {
    private Integer paywayid;

    private String paywayname;

    public Integer getPaywayid() {
        return paywayid;
    }

    public void setPaywayid(Integer paywayid) {
        this.paywayid = paywayid;
    }

    public String getPaywayname() {
        return paywayname;
    }

    public void setPaywayname(String paywayname) {
        this.paywayname = paywayname == null ? null : paywayname.trim();
    }
}