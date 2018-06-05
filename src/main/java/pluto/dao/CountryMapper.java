package pluto.dao;
import pluto.entity.Country;

public interface CountryMapper {

    int deleteByPrimaryKey(Integer countryid);

    int insert(Country record);

    Country selectByPrimaryKey(Integer countryid);

    int updateByPrimaryKey(Country record);
}