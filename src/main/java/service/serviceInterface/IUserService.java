package service.serviceInterface;

import model.User;

public interface IUserService extends IService<User> {
    User findByEmail(String email);

    User verifyLogin(String username, String password);

}
