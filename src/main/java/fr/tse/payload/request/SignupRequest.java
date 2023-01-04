package fr.tse.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
  @NotBlank
  @Size(max = 100)
  @Email
  private String email;

  private String role;

  @NotBlank private String firstname;

  @NotBlank private String lastname;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;
}
