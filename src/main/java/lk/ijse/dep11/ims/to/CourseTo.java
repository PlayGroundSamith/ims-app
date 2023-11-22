package lk.ijse.dep11.ims.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseTo implements Serializable {
    @Null(message = "Id should be empty")
    private Integer id;
    @NotBlank(message = "Description should not be empty")
    private String name;
    @NotBlank(message = "Description should not be empty")
    private Integer durationInMonths;
}
