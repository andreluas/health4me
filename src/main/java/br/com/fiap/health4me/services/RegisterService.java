package br.com.fiap.health4me.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.health4me.dtos.RegisterDTO;
import br.com.fiap.health4me.mappers.RegisterMapper;
import br.com.fiap.health4me.models.Account;
import br.com.fiap.health4me.models.Register;
import br.com.fiap.health4me.repositories.AccountRepository;
import br.com.fiap.health4me.repositories.RegisterRepository;
import br.com.fiap.health4me.services.exceptions.ResourceNotFoundException;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository repository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RegisterMapper mapper;

    public RegisterDTO insert(RegisterDTO dto) {
        Register entity = mapper.dtoToEntity(dto);
        Optional<Account> opAccount = accountRepository.findByEmail(dto.getEmail());
        Account account = opAccount.orElseThrow(() -> new ResourceNotFoundException("Account not found"));
        entity.setAccount(account);
        repository.save(entity);
        return mapper.entityToDTO(entity);
    }

    public RegisterDTO findByEmail(String email) {
        Optional<Register> op = repository.findByEmail(email);
        Register entity = op.orElseThrow(() -> new ResourceNotFoundException("Email not found"));
        return mapper.entityToDTO(entity);
    }
}
