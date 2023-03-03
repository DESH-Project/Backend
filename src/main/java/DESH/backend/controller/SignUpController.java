package DESH.backend.controller;

import DESH.backend.dto.SignUpDTO;
import DESH.backend.entity.User;
import DESH.backend.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignUpController {

    private final SignUpService signUpService;

    @PostMapping("/signUp")
    public User signUp(@RequestBody SignUpDTO signUpDTO) {
        return signUpService.signUp(signUpDTO);
    }
}
