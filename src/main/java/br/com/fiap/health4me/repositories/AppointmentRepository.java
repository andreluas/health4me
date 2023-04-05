package br.com.fiap.health4me.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.health4me.models.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {

}
