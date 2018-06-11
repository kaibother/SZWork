package pluto.dao;
import org.apache.ibatis.annotations.Param;
import pluto.entity.Country;

public interface CountryMapper {

    boolean deleteByPrimaryKey(Integer countryid);

    boolean insert(Country record);

    Country selectByPrimaryKey(Integer countryid);

    boolean updateByPrimaryKey(Country record);

    /*根据国家名查国家id*/
    public Country selectCountryByCountryName(@Param("countryname") String countryname);
}