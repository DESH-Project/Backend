package DESH.backend.service;

import DESH.backend.dto.SignInDTO;
import DESH.backend.entitiy.User;
import DESH.backend.repositiry.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignInService {
    private final UserRepository userRepository;

    public Long signIn(SignInDTO signInDTO) {
        User oldUser = userRepository.findByEmail(signInDTO.getEmail());

        if (oldUser.getPassword().equals(signInDTO.getPassword())){
            return oldUser.getId();
        }
        return null;
    }


}
