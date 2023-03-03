package DESH.backend.controller;

import DESH.backend.dto.SignInDTO;
import DESH.backend.service.SignInService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignInController {

    private final SignInService signInService;
    @PostMapping("/signIn")
    public Long signIn(@RequestBody SignInDTO signInDTO){
        return signInService.signIn(signInDTO);
    }
}
