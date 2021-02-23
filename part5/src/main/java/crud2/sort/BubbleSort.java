package crud2.sort;

import crud2.entity.Course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BubbleSort implements SortStrategy {

    @Override
    public void sortByName(List<Course> courses) {
        for (int i = 0; i < courses.size() - 1; i++) {
            for (int j = 0; j < courses.size() - i - 1; j++) {
                if (courses.get(j).getName().compareToIgnoreCase(courses.get(j + 1).getName()) < 0) {
                    Collections.swap(courses, j, j + 1);
                }
            }
        }
    }

    @Override
    public void sortByOpened(List<Course> courses) throws ParseException {
        for (int i = 0; i < courses.size() - 1; i++) {
            for (int j = 0; j < courses.size() - i - 1; j++) {
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
                Date firstDate = sdf.parse(courses.get(j).getOpened());
                Date secondDate = sdf.parse(courses.get(j + 1).getOpened());
                if (firstDate.after(secondDate)) {
                    Collections.swap(courses, j, j + 1);
                }
            }
        }
    }
}
