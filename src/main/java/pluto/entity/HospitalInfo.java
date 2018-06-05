package pluto.entity;

public class HospitalInfo {
    private Integer hospitalid;

    private String hospitalname;

    private Integer hospitalcityid;

    private Integer hospitaldistrictid;

    private Integer hospitaldistreetid;

    private String hospitalintroduce;

    public Integer getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Integer hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    public Integer getHospitalcityid() {
        return hospitalcityid;
    }

    public void setHospitalcityid(Integer hospitalcityid) {
        this.hospitalcityid = hospitalcityid;
    }

    public Integer getHospitaldistrictid() {
        return hospitaldistrictid;
    }

    public void setHospitaldistrictid(Integer hospitaldistrictid) {
        this.hospitaldistrictid = hospitaldistrictid;
    }

    public Integer getHospitaldistreetid() {
        return hospitaldistreetid;
    }

    public void setHospitaldistreetid(Integer hospitaldistreetid) {
        this.hospitaldistreetid = hospitaldistreetid;
    }

    public String getHospitalintroduce() {
        return hospitalintroduce;
    }

    public void setHospitalintroduce(String hospitalintroduce) {
        this.hospitalintroduce = hospitalintroduce == null ? null : hospitalintroduce.trim();
    }
}