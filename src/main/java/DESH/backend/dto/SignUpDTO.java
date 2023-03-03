package DESH.backend.dto;

import DESH.backend.Job;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDTO {

    private Long id;
    private String email;
    private String password;
    private String name;
    private Job job;
}
