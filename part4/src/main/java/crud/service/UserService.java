package crud.service;

import crud.dto.UserResDto;
import crud.entity.User;
import crud.error.ErrorCodes;
import crud.error.ServiceRuntimeException;
import crud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;


    @Transactional(readOnly = true)
    public UserResDto getUser(Integer studentId) {
        User student = userRepository.findById(studentId)
                .orElseThrow(() -> new ServiceRuntimeException(HttpStatus.NOT_FOUND,
                        ErrorCodes.USER_002,
                        String.format("User not found: #%s", studentId)));
        return modelMapper.map(student, UserResDto.class);
    }

    @Transactional
    public UserResDto createUser(User student) {
        List<User> users = userRepository.findAll();
        if (!users.isEmpty() && users.stream().anyMatch(user -> user.getEmail().equalsIgnoreCase(user.getEmail()))) {
            throw new ServiceRuntimeException(HttpStatus.BAD_REQUEST, ErrorCodes.USER_001, "Email is registered");
        }
        User savedUser = userRepository.save(student);
        return modelMapper.map(savedUser, UserResDto.class);
    }
}
