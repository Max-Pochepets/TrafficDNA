package traffic.dna.testassignment.model.dto.request;

import lombok.Data;

@Data
public class UserRequestDto {
    private Long user_id;
    private Long level_id;
    private Integer result;
}
