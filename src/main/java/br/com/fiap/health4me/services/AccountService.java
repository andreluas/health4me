package br.com.fiap.health4me.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.health4me.dtos.AccountDTO;
import br.com.fiap.health4me.mappers.AccountMapper;
import br.com.fiap.health4me.models.Account;
import br.com.fiap.health4me.repositories.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    @Autowired
    private AccountMapper mapper;

    public AccountDTO insert(AccountDTO dto) {
        Account entity = mapper.dtoToEntity(dto);
        repository.save(entity);
        return mapper.entityToDTO(entity);
    }
}
