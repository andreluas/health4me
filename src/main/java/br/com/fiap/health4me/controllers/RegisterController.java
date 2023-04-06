package br.com.fiap.health4me.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiap.health4me.dtos.RegisterDTO;
import br.com.fiap.health4me.services.RegisterService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/reg")
public class RegisterController {

    @Autowired
    private RegisterService service;

    @PostMapping(value = "/create")
    public ResponseEntity<RegisterDTO> insert(@RequestBody @Valid RegisterDTO dto) {
        RegisterDTO registerDTO = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(registerDTO.getId())
                .toUri();
        return ResponseEntity.created(uri).body(registerDTO);
    }

    @GetMapping(value = "/{email}")
    public ResponseEntity<RegisterDTO> findByEmail(@PathVariable String email) {
        RegisterDTO dto = service.findByEmail(email);
        return ResponseEntity.ok().body(dto);
    }
}
