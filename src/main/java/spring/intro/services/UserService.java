package spring.intro.services;

import spring.intro.model.UserModel;

public interface UserService {
    UserModel getUser(String userName);
    void addUser(UserModel user);
    void deleteUser(String userName);
}
