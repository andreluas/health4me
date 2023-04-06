package br.com.fiap.health4me.dtos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import br.com.fiap.health4me.models.Account;
import br.com.fiap.health4me.models.Appointment;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

public class RegisterDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;

    @CPF
    @NotBlank
    private String cpf;

    @NotBlank
    private String phone;

    @Email
    @NotBlank
    private String email;

    private Date brithdate;

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    private String occupation;
    private String state;
    private String city;
    private String address;
    private boolean smoke;
    private boolean drink;
    private boolean workout;
    private String observation;
    private Account account;
    private Set<Appointment> appointments;

    public RegisterDTO() {
    }

    public RegisterDTO(UUID id, @CPF @NotBlank String cpf, @NotBlank String phone, @Email @NotBlank String email,
            @Future(message = "Brithdate cannot be a future date.") @NotBlank Date brithdate,
            @NotBlank String name, @NotBlank String lastName, String occupation, String state, String city,
            String address, boolean smoke, boolean drink, boolean workout, String observation, Account account,
            Set<Appointment> appointments) {
        this.id = id;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.brithdate = brithdate;
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
        this.state = state;
        this.city = city;
        this.address = address;
        this.smoke = smoke;
        this.drink = drink;
        this.workout = workout;
        this.observation = observation;
        this.account = account;
        this.appointments = appointments;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBrithdate() {
        return brithdate;
    }

    public void setBrithdate(Date brithdate) {
        this.brithdate = brithdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    public boolean isWorkout() {
        return workout;
    }

    public void setWorkout(boolean workout) {
        this.workout = workout;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }

}
