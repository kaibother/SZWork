package pluto.dao;

import pluto.entity.GoodsDetail;

public interface GoodsDetailMapper {
    GoodsDetail selectGoodsDetailByGoodsDetailId(Integer goodsdetailid);
    GoodsDetail selectGoodsDetailNoDogsizeByGoodsDetailId(Integer goodsdetailid);

    boolean deleteByGoodsDetailId(Integer goodsdetailid);
    boolean insert(GoodsDetail record);
    boolean update(GoodsDetail record);
}