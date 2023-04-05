package br.com.fiap.health4me.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.health4me.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {

}
