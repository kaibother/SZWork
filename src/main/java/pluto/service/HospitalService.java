package pluto.service;

import pluto.entity.HospitalInfo;

import java.util.List;

public interface HospitalService {
   List<HospitalInfo>QueryNearbyHospital(String cityname);
}
