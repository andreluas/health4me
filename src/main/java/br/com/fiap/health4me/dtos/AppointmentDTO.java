package br.com.fiap.health4me.dtos;

import java.io.Serializable;
import java.util.UUID;

import br.com.fiap.health4me.models.Register;
import jakarta.validation.constraints.NotBlank;

public class AppointmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private Register register;

    @NotBlank
    private String reasonForAppointment;

    public AppointmentDTO() {
    }

    public AppointmentDTO(UUID id, Register register, @NotBlank String reasonForAppointment) {
        this.id = id;
        this.register = register;
        this.reasonForAppointment = reasonForAppointment;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public String getReasonForAppointment() {
        return reasonForAppointment;
    }

    public void setReasonForAppointment(String reasonForAppointment) {
        this.reasonForAppointment = reasonForAppointment;
    }

}
