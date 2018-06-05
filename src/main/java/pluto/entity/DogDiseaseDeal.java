package pluto.entity;

public class DogDiseaseDeal {
    private Integer dogdiseasedealid;

    private String dealmethod;

    private Integer dogcommondiseaseid;

    public Integer getDogdiseasedealid() {
        return dogdiseasedealid;
    }

    public void setDogdiseasedealid(Integer dogdiseasedealid) {
        this.dogdiseasedealid = dogdiseasedealid;
    }

    public String getDealmethod() {
        return dealmethod;
    }

    public void setDealmethod(String dealmethod) {
        this.dealmethod = dealmethod == null ? null : dealmethod.trim();
    }

    public Integer getDogcommondiseaseid() {
        return dogcommondiseaseid;
    }

    public void setDogcommondiseaseid(Integer dogcommondiseaseid) {
        this.dogcommondiseaseid = dogcommondiseaseid;
    }
}