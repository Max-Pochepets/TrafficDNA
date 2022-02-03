package traffic.dna.testassignment.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import traffic.dna.testassignment.model.User;
import traffic.dna.testassignment.service.UserService;
import traffic.dna.testassignment.storage.UserStorage;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void setUserInfo(User user) {
        UserStorage.userStorage.add(user);
    }

    @Override
    public List<User> getUserInfo(Long userId) {
        return UserStorage.userStorage.stream()
                .filter(u -> Objects.equals(u.getId(), userId))
                .sorted(Comparator.comparing(User::getResult))
                .limit(20)
                .collect(Collectors.toList());
    }

    @Override
    public List<User> getInfoByLevelId(Long levelId) {
        return UserStorage.userStorage.stream()
                .filter(u -> Objects.equals(u.getLevelId(), levelId))
                .sorted(Comparator.comparing(User::getResult))
                .limit(20)
                .collect(Collectors.toList());
    }
}
