package stanl_2.weshareyou.domain.member.aggregate.vo.response;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FindPointResponseVO {

    @NotNull
    private Integer point;
}