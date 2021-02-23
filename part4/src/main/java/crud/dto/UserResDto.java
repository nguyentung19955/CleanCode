package crud.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@Data
public class UserResDto {

    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;

    @ApiModelProperty(value = "User email", example = "xyz@gmail.com")
    private String email;

    @ApiModelProperty(value = "User password", example = "123456")
    private String password;
}
