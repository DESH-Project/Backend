package DESH.backend.service;

import DESH.backend.dto.SignUpDTO;
import DESH.backend.entity.User;
import DESH.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpService {

    private final UserRepository userRepository;

    public User signUp(SignUpDTO signUpDTO) {
        return userRepository.save(User.builder()
                .signUpDTO(signUpDTO)
                .build());
    }
}
