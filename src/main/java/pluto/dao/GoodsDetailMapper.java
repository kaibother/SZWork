package pluto.dao;

import pluto.entity.GoodsDetail;

public interface GoodsDetailMapper {

    int deleteByPrimaryKey(Integer goodsdetailid);

    int insert(GoodsDetail record);

    GoodsDetail selectByPrimaryKey(Integer goodsdetailid);

    int updateByPrimaryKey(GoodsDetail record);
}