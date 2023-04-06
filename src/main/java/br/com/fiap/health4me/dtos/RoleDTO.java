package br.com.fiap.health4me.dtos;

import java.io.Serializable;
import java.util.UUID;

public class RoleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private String authority;

    public RoleDTO() {
    }

    public RoleDTO(UUID id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
