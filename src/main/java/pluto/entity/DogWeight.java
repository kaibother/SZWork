package pluto.entity;

public class DogWeight {
    private Integer dogweightid;

    private Double weight;

    private Double dogweightdiscount;

    @Override
    public String toString() {
        return "DogWeight{" +
                "dogweightid=" + dogweightid +
                ", weight=" + weight +
                ", dogweightdiscount=" + dogweightdiscount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogWeight dogWeight = (DogWeight) o;

        if (!dogweightid.equals(dogWeight.dogweightid)) return false;
        if (!weight.equals(dogWeight.weight)) return false;
        return dogweightdiscount.equals(dogWeight.dogweightdiscount);
    }

    @Override
    public int hashCode() {
        int result = dogweightid.hashCode();
        result = 31 * result + weight.hashCode();
        result = 31 * result + dogweightdiscount.hashCode();
        return result;
    }

    public Integer getDogweightid() {

        return dogweightid;
    }

    public void setDogweightid(Integer dogweightid) {
        this.dogweightid = dogweightid;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getDogweightdiscount() {
        return dogweightdiscount;
    }

    public void setDogweightdiscount(Double dogweightdiscount) {
        this.dogweightdiscount = dogweightdiscount;
    }

    public DogWeight(Integer dogweightid, Double weight, Double dogweightdiscount) {

        this.dogweightid = dogweightid;
        this.weight = weight;
        this.dogweightdiscount = dogweightdiscount;
    }

    public DogWeight(Double weight, Double dogweightdiscount) {

        this.weight = weight;
        this.dogweightdiscount = dogweightdiscount;
    }

    public DogWeight() {

    }
}