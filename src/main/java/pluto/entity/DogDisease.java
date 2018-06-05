package pluto.entity;

public class DogDisease {
    private Integer dogdiseaseid;

    private Integer petid;

    private Integer dogcommondiseaseid;

    public Integer getDogdiseaseid() {
        return dogdiseaseid;
    }

    public void setDogdiseaseid(Integer dogdiseaseid) {
        this.dogdiseaseid = dogdiseaseid;
    }

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public Integer getDogcommondiseaseid() {
        return dogcommondiseaseid;
    }

    public void setDogcommondiseaseid(Integer dogcommondiseaseid) {
        this.dogcommondiseaseid = dogcommondiseaseid;
    }
}