package spring.intro.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import spring.intro.model.UserModel;

import java.util.HashMap;
import java.util.Map;

@Service
@Primary
public class UserServiceImpl implements UserService{

    private final Map<String, UserModel> userMap = new HashMap<>();

    private final TimeService timeService;

    public UserServiceImpl(TimeService timeService) {
        this.timeService = timeService;
        userMap.put("John", new UserModel("John","Doe", 1234));
        userMap.put("Jane", new UserModel("Jane","Doe", 1235));

    }

    public UserModel getUser(String userName) {
        return userMap.get(userName);
    }

    public void addUser(UserModel user) {
        userMap.put(user.getFirstName(), user);
        user.setCreationTime(timeService.getCurrentTime("Los Angeles"));
    }

    public void deleteUser(String userName) {
        userMap.remove(userName);
    }

}
