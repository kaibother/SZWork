package pluto.entity;

public class DogCommonDisease {
    private Integer dogcommondiseaseid;

    private String diseasename;

    public Integer getDogcommondiseaseid() {
        return dogcommondiseaseid;
    }

    public void setDogcommondiseaseid(Integer dogcommondiseaseid) {
        this.dogcommondiseaseid = dogcommondiseaseid;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename == null ? null : diseasename.trim();
    }
}