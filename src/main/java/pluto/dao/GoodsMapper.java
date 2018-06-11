package pluto.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pluto.entity.Goods;
import pluto.entity.GoodsCategory;

import java.util.List;

public interface GoodsMapper {

    boolean deleteByGoodsId(Integer goodsid);
    boolean insert(Goods record);
    boolean updateByGoodsId(Goods goods);

    Goods selectByGoodsId(Integer goodsid);//根据Id查询商品中所有外键不为空的，外键为空返回就是null；
    Goods selectNoDogsizeByGoodsId(Integer goodsid);//根据Id查询商品，dogsizeid可能是空的
    List<Goods> selectByGoodsCategory(Integer goodscategoryid);//根据商品种类Id查询所有外键不为空的；
    List<Goods> selectNoDogsizeByGoodsCategory(Integer goodscategoryid);//根据商品种类Id查询所有外键不为空的；

    List<Goods> selectByType(String type);
    List<Goods> selectNoDogsizeByType(String type);
    List<Goods> selectByBrandId(Integer brandid);
    List<Goods> selectNoDogsizeByBrand(Integer brandid);
    List<Goods> selectByCondition
            (@Param("minprice") Double minprice,@Param("maxprice") Double maxprice,@Param("countryid") Integer countryid,
             @Param("type") String type,@Param("brandid") Integer brandid,@Param("goodscategoryid") Integer goodscategoryid,
             @Param("goodsid") Integer goodsid);

    List<Goods> selectNoDogsizeCondition
            (@Param("minprice") Double minprice,@Param("maxprice") Double maxprice,@Param("countryid") Integer countryid,
             @Param("type") String type,@Param("brandid") Integer brandid,@Param("goodscategoryid") Integer goodscategoryid,
             @Param("goodsid") Integer goodsid);



}
