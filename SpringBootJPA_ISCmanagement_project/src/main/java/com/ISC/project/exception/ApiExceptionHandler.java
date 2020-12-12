package com.ISC.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.ISC.project.payload.ResultRespon;


@RestControllerAdvice
public class ApiExceptionHandler{
    /**
     * Tất cả các Exception không được khai báo sẽ được xử lý tại đây
     */
	
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultRespon handleAllException(Exception ex, WebRequest request) {
        // quá trình kiểm soat lỗi diễn ra ở đây
    	if(ex.getLocalizedMessage().startsWith("could not execute statement; SQL [n/a]; constraint [UK_5d6a3s9bhtbn846qqk9op1lka]")) {
    		return new ResultRespon(1,"Duplicate code room");
    	}
        return new ResultRespon(1, ex.getLocalizedMessage());
        
    }
}
