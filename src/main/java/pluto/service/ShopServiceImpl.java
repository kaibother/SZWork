package pluto.service;

import pluto.entity.Goods;
import pluto.entity.GoodsDetail;
import pluto.entity.Order;

import java.util.List;
import java.util.Map;

public class ShopServiceImpl implements ShopService {
    public List<Goods> HomepageQuery(String info) {
        return null;
    }

    public List<Goods> NavigationBarQuery(String info) {
        return null;
    }

    public List<Goods> QueryGoodByBrand(String brandname) {
        return null;
    }

    public List<Goods> QueryGoodByCountryAddress(String counryname) {
        return null;
    }

    public List<Goods> QueryGoodByPrice(Double price) {
        return null;
    }

    public List<Goods> QueryGoodByWeight(Double weight) {
        return null;
    }

    public boolean AddCart(int userid, GoodsDetail goodsDetail) {
        return false;
    }

    public boolean Purchase(Order order) {
        return false;
    }

    public boolean ModifyCart(int userid, int id, int num) {
        return false;
    }

    public boolean RemoveCart(int userid, int id) {
        return false;
    }

    public boolean SettlementCart(int userid, Map<String, Object> map) {
        return false;
    }
}
