package br.com.fiap.health4me.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import br.com.fiap.health4me.models.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AccountDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;

    @Email(message = "E-mail is not valid.")
    @NotBlank
    private String email;

    @Size(min = 8, max = 255, message = "Password must contain more than 8 digits.")
    @NotBlank
    private String password;
    private Set<Role> roles = new HashSet<>();

    public AccountDTO() {
    }

    public AccountDTO(UUID id, @Email(message = "E-mail is not valid.") @NotBlank String email,
            @Size(min = 8, max = 255, message = "Password must contain more than 8 digits.") @NotBlank String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
