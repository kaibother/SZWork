package pluto.service;

import pluto.entity.Dog;

public interface HomePageService {
    Dog QueryDogInfoByName(String dogname);
}
