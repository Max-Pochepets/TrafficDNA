package traffic.dna.testassignment.service;

import java.util.List;
import traffic.dna.testassignment.model.User;

public interface UserService {
    void setUserInfo(User user);

    List<User> getUserInfo(Long userId);

    List<User> getInfoByLevelId(Long levelId);
}
