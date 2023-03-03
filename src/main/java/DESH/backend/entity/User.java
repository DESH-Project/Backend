package DESH.backend.entity;

import DESH.backend.Job;
import DESH.backend.dto.SignUpDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private Job job;

    @Builder
    public User(SignUpDTO signUpDTO) {
        this.email = signUpDTO.getEmail();
        this.password = signUpDTO.getPassword();
        this.name = signUpDTO.getName();
        this.job = signUpDTO.getJob();
    }
}
