package crud2.dto;

import crud2.entity.Student;
import crud2.entity.Teacher;
import crud2.entity.User;
import crud2.error.ErrorCodes;
import crud2.error.ServiceRuntimeException;
import org.springframework.http.HttpStatus;

public class UserFactory {

    public static User getUser(UserReqDto userReqDto) {
        if (userReqDto.getMode().equals("TEACHER")) {
            if (userReqDto.getStudent() != null) {
                throw new ServiceRuntimeException(HttpStatus.BAD_REQUEST, ErrorCodes.USER_001, "Teacher cannot has student information");
            }
            return new Teacher(userReqDto.getName(), userReqDto.getEmail(), userReqDto.getPassword(),
                    userReqDto.getTeacher().getPhone(), userReqDto.getTeacher().getExperiences());
        }
        if (userReqDto.getMode().equals("STUDENT")) {
            if (userReqDto.getTeacher() != null) {
                throw new ServiceRuntimeException(HttpStatus.BAD_REQUEST, ErrorCodes.USER_001, "Student cannot has teacher information");
            }
            return new Student(userReqDto.getName(), userReqDto.getEmail(), userReqDto.getPassword(),
                    userReqDto.getStudent().getYear());
        }
        throw new IllegalArgumentException("User mode is invalid");
    }
}
