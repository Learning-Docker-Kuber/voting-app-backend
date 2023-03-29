package learning.dockerkuber.apiController;

import learning.dockerkuber.model.Member;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @PostMapping("/api/account/signup")
    public String signUp(@ModelAttribute("member") Member member){
         return "회원가입??";
    }
}
