package traffic.dna.testassignment.model.dto.mapper;

import org.springframework.stereotype.Component;
import traffic.dna.testassignment.model.User;
import traffic.dna.testassignment.model.dto.request.UserRequestDto;
import traffic.dna.testassignment.model.dto.response.UserResponseDto;

@Component
public class UserDtoMapper {
    public User fromDto(UserRequestDto dto) {
        User user = new User();
        user.setId(dto.getUser_id());
        user.setLevelId(dto.getLevel_id());
        user.setResult(dto.getResult());
        return user;
    }

    public UserResponseDto toDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setUser_id(user.getId());
        responseDto.setLevel_id(user.getLevelId());
        responseDto.setResult(user.getResult());
        return responseDto;
    }
}
