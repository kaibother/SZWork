package pluto.dao;

import pluto.entity.GoodsCategory;

public interface GoodsCategoryMapper {

    boolean deleteByGoodsCategoryId(Integer goodscategoryid);

    boolean insert(GoodsCategory record);

    GoodsCategory selectByGoodsCategoryId(Integer goodscategoryid);

    boolean updateByGoodsCategoryId(GoodsCategory record);
}