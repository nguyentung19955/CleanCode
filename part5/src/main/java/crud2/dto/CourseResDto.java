package crud2.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseResDto {

    @ApiModelProperty(value = "Course ID", example = "1")
    private Integer id;

    @ApiModelProperty(value = "Course name", example = "XYZ")
    private String name;

    @ApiModelProperty(value = "Course location", example = "xyz@gmail.com")
    private String location;

    @ApiModelProperty(value = "Course opened", example = "20/01/1995")
    private String opened;

    @ApiModelProperty(value = "Teacher name", example = "Tung")
    private String teacherName;
}
