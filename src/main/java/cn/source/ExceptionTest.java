package cn.source;

import cn.source.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ExceptionTest {
    @RequestMapping("/1")
    public String test1() throws SysException{
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("除数为零");
        }
        return "";
    }
}
