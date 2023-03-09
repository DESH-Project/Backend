package DESH.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInDTO {
    private String name;
    private String email;
    private String password;
    private String job;
}
