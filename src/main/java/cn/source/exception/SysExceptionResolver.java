package cn.source.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if (e instanceof SysException){
            e = (SysException) e;
        }else {
            e = new SysException("该项功能正在维护中...");
        }
        ModelAndView view = new ModelAndView();
        view.addObject("errorMsg",e.getMessage());
        view.setViewName("error");
        return view;
    }
}
