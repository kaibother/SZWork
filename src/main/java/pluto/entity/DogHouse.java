package pluto.entity;

public class DogHouse {
    private Integer doghouseid;

    private String doghousename;

    private DogHouseGrade dogHouseGrade;

    private DogSize dogSize;

    private  String doghousepic;

    private  String doghousebig;

    private String doghouseimg;

    private String doghousetiny;

    @Override
    public String toString() {
        return "DogHouse{" +
                "doghouseid=" + doghouseid +
                ", doghousename='" + doghousename + '\'' +
                ", dogHouseGrade=" + dogHouseGrade +
                ", dogSize=" + dogSize +
                ", doghousepic='" + doghousepic + '\'' +
                ", doghousebig='" + doghousebig + '\'' +
                ", doghouseimg='" + doghouseimg + '\'' +
                ", doghousetiny='" + doghousetiny + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogHouse dogHouse = (DogHouse) o;

        if (doghouseid != null ? !doghouseid.equals(dogHouse.doghouseid) : dogHouse.doghouseid != null) return false;
        if (doghousename != null ? !doghousename.equals(dogHouse.doghousename) : dogHouse.doghousename != null)
            return false;
        if (dogHouseGrade != null ? !dogHouseGrade.equals(dogHouse.dogHouseGrade) : dogHouse.dogHouseGrade != null)
            return false;
        if (dogSize != null ? !dogSize.equals(dogHouse.dogSize) : dogHouse.dogSize != null) return false;
        if (doghousepic != null ? !doghousepic.equals(dogHouse.doghousepic) : dogHouse.doghousepic != null)
            return false;
        if (doghousebig != null ? !doghousebig.equals(dogHouse.doghousebig) : dogHouse.doghousebig != null)
            return false;
        if (doghouseimg != null ? !doghouseimg.equals(dogHouse.doghouseimg) : dogHouse.doghouseimg != null)
            return false;
        return doghousetiny != null ? doghousetiny.equals(dogHouse.doghousetiny) : dogHouse.doghousetiny == null;
    }

    @Override
    public int hashCode() {
        int result = doghouseid != null ? doghouseid.hashCode() : 0;
        result = 31 * result + (doghousename != null ? doghousename.hashCode() : 0);
        result = 31 * result + (dogHouseGrade != null ? dogHouseGrade.hashCode() : 0);
        result = 31 * result + (dogSize != null ? dogSize.hashCode() : 0);
        result = 31 * result + (doghousepic != null ? doghousepic.hashCode() : 0);
        result = 31 * result + (doghousebig != null ? doghousebig.hashCode() : 0);
        result = 31 * result + (doghouseimg != null ? doghouseimg.hashCode() : 0);
        result = 31 * result + (doghousetiny != null ? doghousetiny.hashCode() : 0);
        return result;
    }

    public Integer getDoghouseid() {

        return doghouseid;
    }

    public void setDoghouseid(Integer doghouseid) {
        this.doghouseid = doghouseid;
    }

    public String getDoghousename() {
        return doghousename;
    }

    public void setDoghousename(String doghousename) {
        this.doghousename = doghousename;
    }

    public DogHouseGrade getDogHouseGrade() {
        return dogHouseGrade;
    }

    public void setDogHouseGrade(DogHouseGrade dogHouseGrade) {
        this.dogHouseGrade = dogHouseGrade;
    }

    public DogSize getDogSize() {
        return dogSize;
    }

    public void setDogSize(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public String getDoghousepic() {
        return doghousepic;
    }

    public void setDoghousepic(String doghousepic) {
        this.doghousepic = doghousepic;
    }

    public String getDoghousebig() {
        return doghousebig;
    }

    public void setDoghousebig(String doghousebig) {
        this.doghousebig = doghousebig;
    }

    public String getDoghouseimg() {
        return doghouseimg;
    }

    public void setDoghouseimg(String doghouseimg) {
        this.doghouseimg = doghouseimg;
    }

    public String getDoghousetiny() {
        return doghousetiny;
    }

    public void setDoghousetiny(String doghousetiny) {
        this.doghousetiny = doghousetiny;
    }

    public DogHouse(String doghousename, DogHouseGrade dogHouseGrade, DogSize dogSize, String doghousepic, String doghousebig, String doghouseimg, String doghousetiny) {

        this.doghousename = doghousename;
        this.dogHouseGrade = dogHouseGrade;
        this.dogSize = dogSize;
        this.doghousepic = doghousepic;
        this.doghousebig = doghousebig;
        this.doghouseimg = doghouseimg;
        this.doghousetiny = doghousetiny;
    }

    public DogHouse(Integer doghouseid, String doghousename, DogHouseGrade dogHouseGrade, DogSize dogSize, String doghousepic, String doghousebig, String doghouseimg, String doghousetiny) {

        this.doghouseid = doghouseid;
        this.doghousename = doghousename;
        this.dogHouseGrade = dogHouseGrade;
        this.dogSize = dogSize;
        this.doghousepic = doghousepic;
        this.doghousebig = doghousebig;
        this.doghouseimg = doghouseimg;
        this.doghousetiny = doghousetiny;
    }

    public DogHouse() {

    }
}