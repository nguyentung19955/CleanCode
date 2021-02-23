package crud2.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
public class StudentReqDto {

    @NotNull
    @Min(1)
    @ApiModelProperty(value = "Student year", example = "1")
    private Integer year;
}
