package pluto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pluto.dao.DogHouseGradeMapper;
import pluto.dao.DogHouseMapper;
import pluto.dao.FosterDetailMapper;
import pluto.entity.DogHouse;
import pluto.entity.DogHouseGrade;
import pluto.entity.FosterDetail;

import java.util.List;


@Service
public class HostelServiceImpl implements HostelService{

    @Autowired
    private FosterDetailMapper fosterDetailMapper;
    @Autowired
    private DogHouseMapper dogHouseMapper;
    @Autowired
    private DogHouseGradeMapper dogHouseGradeMapper;

    public List<DogHouseGrade> queryAllDogHouseGrade() {
        return dogHouseGradeMapper.selectAllDogHouseGrade();
    }

    public DogHouseGrade queryDogHouseGradeById(Integer doghousegradeid) {
        return dogHouseGradeMapper.selectDogHouseGradeById(doghousegradeid);
    }


    public DogHouse queryHouseById(Integer doghouseid) {
        return dogHouseMapper.selectHouseById(doghouseid);
    }

    public List<DogHouse> queryAllHouse() {
        return dogHouseMapper.selectAllHouse();
    }

    public List<DogHouse> queryDogHouseNameByGrade(Integer doghousegradeid) {
        return dogHouseMapper.selectDogHouseNameByGrade(doghousegradeid);
    }

    public List<DogHouse> queryDogHouseNameBySize(Integer dogsizeid) {
        return dogHouseMapper.selectDogHouseNameBySize(dogsizeid);
    }

    public List<DogHouse> queryDogHouseNameByGradeAndSize(Integer doghousegradeid, Integer dogsizeid) {
        return dogHouseMapper.selectDogHouseNameByGradeAndSize(doghousegradeid,dogsizeid);
    }

    public FosterDetail queryFosterDetailById(Integer fosterdetailid) {
        return fosterDetailMapper.selectFosterDetailById(fosterdetailid);
    }

    public List<FosterDetail> queryFosterDetailByPetId(Integer petid) {
        return fosterDetailMapper.selectFosterDetailByPetId(petid);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean addFosterDetail(FosterDetail fosterDetail) {
        return fosterDetailMapper.insertFosterDetail(fosterDetail);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean modifyFosterDetail(FosterDetail fosterDetail) {
        return fosterDetailMapper.updateFosterDetail(fosterDetail);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean removeFosterDetailById(Integer fosterdetailid) {
        return fosterDetailMapper.deleteFosterDetailById(fosterdetailid);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean removeFosterDetailByPetId(Integer petid) {
        return fosterDetailMapper.deleteFosterDetailByPetId(petid);
    }

    public FosterDetail queryFosterDetailByOrderId(Integer orderid) {
        return fosterDetailMapper.selectFosterDetailByOrderId(orderid);
    }


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public boolean removeFosterDetailByOrderId(Integer orderid) {
        return fosterDetailMapper.deleteFosterDetailByOrderId(orderid);
    }
}
