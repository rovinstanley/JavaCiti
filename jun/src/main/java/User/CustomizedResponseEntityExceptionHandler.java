package user;
import java.util.Date;

import User.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(Exception.class)
    //override method of ResponseEntityExceptionHandler class
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request)
    {
        //creating exception response structure
        user.ExceptionResponse exceptionResponse= new user.ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        //returning exception structure and specific status
        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(UserNotFoundException.class)
    //override method of ResponseEntityExceptionHandler class
    public final ResponseEntity<Object> handleUserNotFoundExceptions(UserNotFoundException ex, WebRequest request)
    {
        //creating exception response structure
        user.ExceptionResponse exceptionResponse= new user.ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        //returning exception structure and specific status
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request)
    {
        user.ExceptionResponse exceptionResponse= new user.ExceptionResponse(new Date(), "Validation Failed", ex.getBindingResult().toString());
        //returning exception structure and specific status
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}