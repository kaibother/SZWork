package pluto.entity;

public class ServiceType {
    private Integer servicetypeid;

    private String serviceinfo;

    private String servicename;

    public Integer getServicetypeid() {
        return servicetypeid;
    }

    public void setServicetypeid(Integer servicetypeid) {
        this.servicetypeid = servicetypeid;
    }

    public String getServiceinfo() {
        return serviceinfo;
    }

    public void setServiceinfo(String serviceinfo) {
        this.serviceinfo = serviceinfo == null ? null : serviceinfo.trim();
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }
}