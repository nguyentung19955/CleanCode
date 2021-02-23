package crud.controller;

import crud.dto.UserFactory;
import crud.dto.UserReqDto;
import crud.dto.UserResDto;
import crud.entity.User;
import crud.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/users")
public class UserController {

    private final UserService userService;


    @GetMapping("/{user_id}")
    @ApiOperation("Get user by user ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get user successfully"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public ResponseEntity<UserResDto> getUser(
            @ApiParam(value = "User ID", example = "123") @PathVariable(value = "user_id") Integer userId) {
        UserResDto response = userService.getUser(userId);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping()
    @ApiOperation("Create user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Create user successfully"),
            @ApiResponse(code = 400, message = "Create user failed")
    })
    public ResponseEntity<UserResDto> createUser(@Valid @RequestBody UserReqDto userReqDto) {
        User user = UserFactory.getUser(userReqDto);
        UserResDto response = userService.createUser(user);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
