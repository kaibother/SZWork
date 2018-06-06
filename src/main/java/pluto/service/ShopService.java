package pluto.service;

import pluto.entity.Goods;
import pluto.entity.GoodsDetail;
import pluto.entity.Order;

import java.util.List;
import java.util.Map;

public interface ShopService {
    List<Goods>HomepageQuery(String info);
    //导航栏搜索
    List<Goods>NavigationBarQuery(String info);

    List<Goods>QueryGoodByBrand(String brandname);

    List<Goods>QueryGoodByCountryAddress(String counryname);

    List<Goods>QueryGoodByPrice(Double price);

    List<Goods>QueryGoodByWeight(Double weight);

    boolean AddCart(int userid,GoodsDetail goodsDetail);
    //购买功能
    boolean Purchase(Order order);
    //购物车信息修改  （商品、服务、寄养）明细id  商品数量（商品、服务、寄养）
    boolean ModifyCart(int userid,int id,int num);
    //购物车信息删除	（商品、服务、寄养）明细id
    boolean RemoveCart(int userid,int id);
    //结算(将商品明细、服务明细、旅店明细打包成map集合)
    boolean SettlementCart(int userid,Map<String,Object> map);
}
