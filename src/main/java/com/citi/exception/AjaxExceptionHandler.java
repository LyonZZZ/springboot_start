package com.citi.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

//@RestControllerAdvice
public class AjaxExceptionHandler {
	
	//@ExceptionHandler(value=Exception.class)
	public Object defaultErrorHandler(HttpServletRequest request,HttpServletResponse response,
								Exception exception) throws Exception{
		
		exception.printStackTrace();
		
		/*ModelAndView modelAndView  =new ModelAndView();
		modelAndView.addObject("exception", exception);
		modelAndView.addObject("url",request.getRequestURL());*/
		return "exception";
	}
	

}
