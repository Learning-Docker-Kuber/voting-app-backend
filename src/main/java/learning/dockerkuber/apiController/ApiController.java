package learning.dockerkuber.apiController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/test")
    public String testApi(){
        return "스프링 테스트 api 리턴값입니다.";
    }
}
