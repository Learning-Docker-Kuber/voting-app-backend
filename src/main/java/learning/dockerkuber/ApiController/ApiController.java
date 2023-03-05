package learning.dockerkuber.ApiController;

import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {

    @GetMapping("/api/test")
    public String testApi(){
        return "스프링 테스트 api 리턴값입니다.";
    }
}
