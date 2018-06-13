package pluto.service;

import pluto.entity.DogHouse;
import pluto.entity.DogHouseGrade;
import pluto.entity.FosterDetail;

import java.util.List;

public interface HostelService {

   //查询所有狗狗房屋等级实体
   List<DogHouseGrade> queryAllDogHouseGrade();

   //按照名字查询狗狗房屋等级实体

   DogHouseGrade queryDogHouseGradeById(Integer doghousegradeid);
   //按照id查询
   DogHouse queryHouseById(Integer doghouseid);

   //查询所有房屋实体
   List<DogHouse> queryAllHouse();

   //按照狗狗房屋等级id，查询DogHouse实体
   List<DogHouse>queryDogHouseNameByGrade(Integer doghousegradeid);

   //按照狗狗体型id，查询DogHouse实体
   List<DogHouse>queryDogHouseNameBySize(Integer dogsizeid);

   //按照狗狗房屋等级id & 狗狗体型id，查询DogHouse实体
   List<DogHouse>queryDogHouseNameByGradeAndSize(Integer doghousegradeid,Integer dogsizeid);


   //按照fosterdetailid查询FosterDetail实体
   FosterDetail queryFosterDetailById(Integer fosterdetailid);

   //按照petid查询FosterDetail实体
   List<FosterDetail> queryFosterDetailByPetId(Integer petid);

   //添加FosterDetail
   boolean addFosterDetail(FosterDetail fosterDetail);

   //修改FosterDetail
   boolean modifyFosterDetail(FosterDetail fosterDetail);

   //按照fosterdetailid删除  FosterDetail
   boolean removeFosterDetailById(Integer fosterdetailid);

   //按照petid删除  FosterDetail
   boolean removeFosterDetailByPetId(Integer petid);

   //按照orderid查询  FosterDetail
   FosterDetail queryFosterDetailByOrderId(Integer orderid);

   //按照orderid删除  FosterDetail
   boolean removeFosterDetailByOrderId(Integer orderid);
}
