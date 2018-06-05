package pluto.dao;

import pluto.entity.GoodsCategory;

public interface GoodsCategoryMapper {

    int deleteByPrimaryKey(Integer goodscategoryid);

    int insert(GoodsCategory record);

    GoodsCategory selectByPrimaryKey(Integer goodscategoryid);

    int updateByPrimaryKey(GoodsCategory record);
}