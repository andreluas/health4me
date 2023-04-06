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

import br.com.fiap.health4me.dtos.AppointmentDTO;
import br.com.fiap.health4me.services.AppointmentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/app")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping(value = "/create")
    public ResponseEntity<AppointmentDTO> insert(@RequestBody @Valid AppointmentDTO dto) {
        AppointmentDTO appointmentDTO = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(appointmentDTO.getId())
                .toUri();
        return ResponseEntity.created(uri).body(appointmentDTO);
    }

    @GetMapping(value = "/{email}")
    public ResponseEntity<AppointmentDTO> findByEmail(@PathVariable String email) {
        AppointmentDTO dto = service.findByEmail(email);
        return ResponseEntity.ok().body(dto);
    }
}
