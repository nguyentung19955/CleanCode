package crud2.sort;

import crud2.entity.Course;

import java.text.ParseException;
import java.util.List;


public interface SortStrategy {
    void sortByName(List<Course> courses);

    void sortByOpened(List<Course> courses) throws ParseException;
}
