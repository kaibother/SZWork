package pluto.service;

public interface LoginService {
    boolean Login(String username,String password);
    boolean Register(String username,String password,String tel,String message);
}
