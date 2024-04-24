package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    private Long id;
    private String fullName;
    private String email;
    private String address;
    private String birthDay;
    private String password;
    private String gender;
    private String phoneNumber;
}
