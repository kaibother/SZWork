package pluto.service;

import pluto.entity.Dog;

import java.util.List;

public interface FamilyService {
    List<Dog>QueryDogByCondition(String size,String type);


    //返回值为智商描述e.g：狗狗太聪明了
    String TestDogIQ(String dogname);
}
