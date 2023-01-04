package fr.tse.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(
    name = "user",
    uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Email
  @Column(unique = true)
  private String email;

  @NotNull
  @Size(max = 120)
  @JsonIgnore
  private String password;

  @NotNull private String firstname;

  @NotNull private String lastname;

  @Enumerated(EnumType.STRING)
  private ERole role;

  public User() {}

  public User(
      final String firstname, final String lastname, final String email, final String password) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.password = password;
  }

  public User(final String email, final String password, final ERole role) {
    this.email = email;
    this.password = password;
    this.role = role;
  }
}
