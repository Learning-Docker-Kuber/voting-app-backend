package learning.dockerkuber.apiController;

import learning.dockerkuber.model.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MemberController {

    @PostMapping("/api/account/signup")
    public String signUp(@RequestBody Member member){
         return "회원가입??";
    }
}
