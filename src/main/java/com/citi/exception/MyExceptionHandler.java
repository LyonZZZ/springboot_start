package com.citi.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice
public class MyExceptionHandler {
	public static final String ERROR_VIEW = "error";
	
	/*@ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request,HttpServletResponse response,
								Exception exception) throws Exception{
		
		exception.printStackTrace();
		
		ModelAndView modelAndView  =new ModelAndView();
		modelAndView.addObject("exception", exception);
		modelAndView.addObject("url",request.getRequestURL());
		modelAndView.setViewName(ERROR_VIEW);
		return modelAndView;
	}
	*/
	
	@ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request,HttpServletResponse response,
								Exception exception) throws Exception{
		
		exception.printStackTrace();
		if (isAjax(request)) {
			return "isAjax";
		}else {
			ModelAndView modelAndView  =new ModelAndView();
			modelAndView.addObject("exception", exception);
			modelAndView.addObject("url",request.getRequestURL());
			modelAndView.setViewName(ERROR_VIEW);
			return modelAndView;
		}
	}

	//判斷是否為ajax請求
	private boolean isAjax(HttpServletRequest request) {
		return (request.getHeader("X-Requested-With") !=null
				&& "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()) );
	}

}
