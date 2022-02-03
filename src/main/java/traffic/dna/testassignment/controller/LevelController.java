package traffic.dna.testassignment.controller;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import traffic.dna.testassignment.model.dto.mapper.UserDtoMapper;
import traffic.dna.testassignment.model.dto.response.UserResponseDto;
import traffic.dna.testassignment.service.UserService;

@RestController
@RequestMapping("/levelInfo")
@RequiredArgsConstructor
public class LevelController {
    private final UserService userService;
    private final UserDtoMapper dtoMapper;

    @GetMapping("/{levelId}")
    public List<UserResponseDto> getLevelInfo(@PathVariable Long levelId) {
        return userService.getInfoByLevelId(levelId).stream()
                .map(dtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
