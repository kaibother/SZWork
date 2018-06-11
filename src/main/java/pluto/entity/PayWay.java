package pluto.entity;

public class PayWay {
    private Integer paywayid;

    private String paywayname;

    @Override
    public String toString() {
        return "PayWay{" +
                "paywayid=" + paywayid +
                ", paywayname='" + paywayname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PayWay payWay = (PayWay) o;

        if (!paywayid.equals(payWay.paywayid)) return false;
        return paywayname.equals(payWay.paywayname);
    }

    @Override
    public int hashCode() {
        int result = paywayid.hashCode();
        result = 31 * result + paywayname.hashCode();
        return result;
    }

    public PayWay(String paywayname) {

        this.paywayname = paywayname;
    }

    public PayWay(Integer paywayid, String paywayname) {

        this.paywayid = paywayid;
        this.paywayname = paywayname;
    }

    public PayWay() {

    }

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