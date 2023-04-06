package br.com.fiap.health4me.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiap.health4me.dtos.AccountDTO;
import br.com.fiap.health4me.services.AccountService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/acc")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping(value = "/create")
    public ResponseEntity<AccountDTO> insert(@RequestBody @Valid AccountDTO dto) {
        AccountDTO accountDTO = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(accountDTO.getId())
                .toUri();
        return ResponseEntity.created(uri).body(accountDTO);
    }
}
