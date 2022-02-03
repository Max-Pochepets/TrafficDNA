package traffic.dna.testassignment.model.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponseDto {
    private Long user_id;
    private Long level_id;
    private Integer result;
}
