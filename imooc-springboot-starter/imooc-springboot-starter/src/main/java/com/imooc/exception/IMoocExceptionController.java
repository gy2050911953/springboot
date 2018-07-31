package com.imooc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class IMoocExceptionController {

	public static final String IMOOC_ERROR_VIEW="error";
	
	@ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e){
		e.printStackTrace();
		
		ModelAndView view = new ModelAndView();
		view.addObject("exception",e);
		view.addObject("url", request.getRequestURL());
		view.setViewName(IMOOC_ERROR_VIEW);
		return view;
	}
}
