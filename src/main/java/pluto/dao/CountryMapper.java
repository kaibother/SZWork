package pluto.dao;
import org.apache.ibatis.annotations.Param;
import pluto.entity.Country;

public interface CountryMapper {

    /*根据国家名查国家id*/
    public Country selectCountryByCountryName(@Param("countryname") String countryname);
}