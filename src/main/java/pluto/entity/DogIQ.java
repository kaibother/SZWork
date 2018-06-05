package pluto.entity;

public class DogIQ {
    private Integer dogiqid;

    private String iq;

    public Integer getDogiqid() {
        return dogiqid;
    }

    public void setDogiqid(Integer dogiqid) {
        this.dogiqid = dogiqid;
    }

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq == null ? null : iq.trim();
    }
}