package crud2.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class TeacherReqDto {
	
	@NotEmpty
	@NotNull
	@ApiModelProperty(value = "Teacher phone", example = "0123456789")
	private String phone;

	@NotNull
	@ApiModelProperty(value = "Teacher experiences", example = "1")
	@Min(0)
	private Integer experiences;
}
