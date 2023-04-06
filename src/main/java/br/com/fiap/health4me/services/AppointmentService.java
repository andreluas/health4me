package br.com.fiap.health4me.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.health4me.dtos.AppointmentDTO;
import br.com.fiap.health4me.mappers.AppointmentMapper;
import br.com.fiap.health4me.models.Appointment;
import br.com.fiap.health4me.models.Register;
import br.com.fiap.health4me.repositories.AppointmentRepository;
import br.com.fiap.health4me.repositories.RegisterRepository;
import br.com.fiap.health4me.services.exceptions.ResourceNotFoundException;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    @Autowired
    private RegisterRepository registerRepository;

    @Autowired
    private AppointmentMapper mapper;

    public AppointmentDTO insert(AppointmentDTO dto) {
        Appointment entity = mapper.dtoToEntity(dto);
        Optional<Register> opRegister = registerRepository.findByEmail(dto.getRegister());
        entity.setRegister(opRegister.orElseThrow(() -> new ResourceNotFoundException("Register not found.")));
        repository.save(entity);
        return mapper.entityToDTO(entity);
    }

    public AppointmentDTO findByEmail(String email) {
        Optional<Register> opRegister = registerRepository.findByEmail(email);
        Register register = opRegister.orElseThrow(() -> new ResourceNotFoundException("Email not found."));
        Optional<Appointment> opAppointment = repository.findByRegister(register);
        Appointment appointment = opAppointment.orElseThrow(() -> new ResourceNotFoundException("Register not found."));
        return mapper.entityToDTO(appointment);
    }
}
