package DESH.backend.dto;

import DESH.backend.Job;
import DESH.backend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDTO {

    private String email;
    private String password;
    private String name;
    private Job job;

    public User toEntity() {
        return new User(null, email, password, name, job);
    }
}
