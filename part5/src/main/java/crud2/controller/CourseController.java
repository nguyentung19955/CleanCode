package crud2.controller;

import crud2.dto.CourseResDto;
import crud2.dto.UserFactory;
import crud2.dto.UserReqDto;
import crud2.dto.UserResDto;
import crud2.entity.Course;
import crud2.entity.User;
import crud2.service.CourseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/courses")
public class CourseController {

    private final CourseService courseService;

    @PostMapping()
    @ApiOperation("Search course")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Search course successfully"),
            @ApiResponse(code = 400, message = "Create user failed")
    })
    public ResponseEntity<List<CourseResDto>> searchCourses(@RequestParam(name = "keyword", required = false) String keyword,
                                                            @RequestParam(name = "sortBy", required = false) String sortBy) throws ParseException {
        List<CourseResDto> courseResDtos = courseService.searchCourses(keyword, sortBy);
        return new ResponseEntity<>(courseResDtos, HttpStatus.OK);
    }
}
