package pluto.dao;

import pluto.entity.FosterDetail;

public interface FosterDetailMapper {

    int deleteByPrimaryKey(Integer fosterdetailid);

    int insert(FosterDetail record);

    FosterDetail selectByPrimaryKey(Integer fosterdetailid);

    int updateByPrimaryKey(FosterDetail record);
}