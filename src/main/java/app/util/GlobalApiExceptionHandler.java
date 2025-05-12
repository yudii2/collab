package app.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalApiExceptionHandler {


	@ExceptionHandler(value = (ApiException.class))
	public ErrorResponse apiExceptionHanlder(ApiException e) {
		return new ErrorResponse(e.getMessage());
	}
}
