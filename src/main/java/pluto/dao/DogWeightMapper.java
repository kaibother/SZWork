package pluto.dao;

import pluto.entity.DogWeight;

import java.util.List;

public interface DogWeightMapper {
    //查出所有实体
    List<DogWeight>selectAllDogWeight();
    //按照id查询weight
    DogWeight selectDogWeightById(Integer dogweightid);

    Double selectDogWeightDiscountByWeight(Double weight);
}