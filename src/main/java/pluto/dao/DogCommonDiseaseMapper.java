package pluto.dao;

import pluto.entity.DogCommonDisease;

public interface DogCommonDiseaseMapper {

    int deleteByPrimaryKey(Integer dogcommondiseaseid);

    int insert(DogCommonDisease record);

    DogCommonDisease selectByPrimaryKey(Integer dogcommondiseaseid);

    int updateByPrimaryKey(DogCommonDisease record);
}