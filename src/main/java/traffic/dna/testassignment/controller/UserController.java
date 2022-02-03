package traffic.dna.testassignment.controller;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import traffic.dna.testassignment.model.dto.mapper.UserDtoMapper;
import traffic.dna.testassignment.model.dto.request.UserRequestDto;
import traffic.dna.testassignment.model.dto.response.UserResponseDto;
import traffic.dna.testassignment.service.UserService;

@RestController
@RequestMapping("/userInfo")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserDtoMapper dtoMapper;

    @GetMapping("/{userId}")
    public List<UserResponseDto> getUserInfo(@PathVariable Long userId) {
        return userService.getUserInfo(userId).stream()
                .map(dtoMapper::toDto)
                .collect(Collectors.toList());
    }

    @PutMapping
    public void setUserInfo(@RequestBody UserRequestDto requestDto) {
        userService.setUserInfo(dtoMapper.fromDto(requestDto));
    }
}
