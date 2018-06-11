package pluto.entity;

public class FosterDetail {
    private Integer fosterdetailid;

    private Integer fosterday;

    private Double fostertotalprice;

    private DogHouseGrade doghousegrade;

    private Pet pet;

    private Order order;

    @Override
    public String toString() {
        return "FosterDetail{" +
                "fosterdetailid=" + fosterdetailid +
                ", fosterday=" + fosterday +
                ", fostertotalprice=" + fostertotalprice +
                ", doghousegrade=" + doghousegrade +
                ", pet=" + pet +
                ", order=" + order +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FosterDetail that = (FosterDetail) o;

        if (fosterdetailid != null ? !fosterdetailid.equals(that.fosterdetailid) : that.fosterdetailid != null)
            return false;
        if (fosterday != null ? !fosterday.equals(that.fosterday) : that.fosterday != null) return false;
        if (fostertotalprice != null ? !fostertotalprice.equals(that.fostertotalprice) : that.fostertotalprice != null)
            return false;
        if (doghousegrade != null ? !doghousegrade.equals(that.doghousegrade) : that.doghousegrade != null)
            return false;
        if (pet != null ? !pet.equals(that.pet) : that.pet != null) return false;
        return order != null ? order.equals(that.order) : that.order == null;
    }

    @Override
    public int hashCode() {
        int result = fosterdetailid != null ? fosterdetailid.hashCode() : 0;
        result = 31 * result + (fosterday != null ? fosterday.hashCode() : 0);
        result = 31 * result + (fostertotalprice != null ? fostertotalprice.hashCode() : 0);
        result = 31 * result + (doghousegrade != null ? doghousegrade.hashCode() : 0);
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        return result;
    }

    public Integer getFosterdetailid() {

        return fosterdetailid;
    }

    public void setFosterdetailid(Integer fosterdetailid) {
        this.fosterdetailid = fosterdetailid;
    }

    public Integer getFosterday() {
        return fosterday;
    }

    public void setFosterday(Integer fosterday) {
        this.fosterday = fosterday;
    }

    public Double getFostertotalprice() {
        return fostertotalprice;
    }

    public void setFostertotalprice(Double fostertotalprice) {
        this.fostertotalprice = fostertotalprice;
    }

    public DogHouseGrade getDoghousegrade() {
        return doghousegrade;
    }

    public void setDoghousegrade(DogHouseGrade doghousegrade) {
        this.doghousegrade = doghousegrade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public FosterDetail(Integer fosterday, Double fostertotalprice, DogHouseGrade doghousegrade, Pet pet, Order order) {

        this.fosterday = fosterday;
        this.fostertotalprice = fostertotalprice;
        this.doghousegrade = doghousegrade;
        this.pet = pet;
        this.order = order;
    }

    public FosterDetail(Integer fosterdetailid, Integer fosterday, Double fostertotalprice, DogHouseGrade doghousegrade, Pet pet, Order order) {

        this.fosterdetailid = fosterdetailid;
        this.fosterday = fosterday;
        this.fostertotalprice = fostertotalprice;
        this.doghousegrade = doghousegrade;
        this.pet = pet;
        this.order = order;
    }

    public FosterDetail() {

    }
}