package crud2.service;

import crud2.dto.CourseResDto;
import crud2.entity.Course;
import crud2.repository.CourseRepository;
import crud2.sort.BubbleSort;
import crud2.sort.SortStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    private SortStrategy sortStrategy;

    @Cacheable(value = "course", key = "'' + #keyword + ''+ #sortBy")
    public List<CourseResDto> searchCourses(String keyword, String sortBy) throws ParseException {
        sortStrategy = new BubbleSort();
        List<Course> courses;
        if (StringUtils.hasText(keyword)) {
            courses = courseRepository.findAllByNameContains(keyword);
        } else {
            courses = courseRepository.findAll();
        }
        if (courses.isEmpty()) {
            return new ArrayList<>();
        }
        if (StringUtils.hasText(sortBy) && sortBy.equals("name")) {
            sortStrategy.sortByName(courses);
        }
        if (StringUtils.hasText(sortBy) && sortBy.equals("opened")) {
            sortStrategy.sortByOpened(courses);
        }

        List<CourseResDto> courseResDtos = new ArrayList<>();
        courses.stream().forEach(course -> {
                    String teacherName = null;
                    if (course.getUser() != null) {
                        teacherName = course.getUser().getName();
                    }
                    courseResDtos.add(new CourseResDto(course.getId(), course.getName(), course.getLocation(), course.getOpened(), teacherName));
                }
        );
        return courseResDtos;
    }
}
