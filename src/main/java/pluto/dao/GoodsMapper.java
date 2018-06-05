package pluto.dao;

import pluto.entity.Goods;

public interface GoodsMapper {

    int deleteByPrimaryKey(Integer goodsid);

    int insert(Goods record);

    Goods selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKey(Goods record);
}