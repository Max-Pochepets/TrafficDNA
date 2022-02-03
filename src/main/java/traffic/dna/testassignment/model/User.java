package traffic.dna.testassignment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Long id;
    private Long levelId;
    private Integer result;
}
