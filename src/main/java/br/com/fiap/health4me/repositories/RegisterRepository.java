package br.com.fiap.health4me.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.health4me.models.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, UUID> {

    Optional<Register> findByEmail(String email);
}
