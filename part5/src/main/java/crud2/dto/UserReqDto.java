package crud2.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserReqDto{
	
	@NotNull
	@NotEmpty
	@ApiModelProperty(value = "User name", example = "XYZ")
	private String name;
	
	@NotNull
	@NotEmpty
	@ApiModelProperty(value = "User email", example = "xyz@gmail.com")
	private String email;
	
	@NotNull
	@NotEmpty
	@ApiModelProperty(value = "User password", example = "123456")
	private String password;
	
	@Valid
	private TeacherReqDto teacher;
	
	@Valid
	private StudentReqDto student;
	
	@NotNull
	@NotEmpty
	@ApiModelProperty(value = "User mode", example = "123456")
	private String mode;
}
