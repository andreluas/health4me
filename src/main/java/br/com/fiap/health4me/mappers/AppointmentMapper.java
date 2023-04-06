package br.com.fiap.health4me.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.fiap.health4me.dtos.AppointmentDTO;
import br.com.fiap.health4me.models.Appointment;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface AppointmentMapper {

    @Mapping(target = "register.email", source = "register")
    Appointment dtoToEntity(AppointmentDTO acccountDTO);

    @Mapping(target = "register", source = "register.email")
    AppointmentDTO entityToDTO(Appointment Appointment);

    List<AppointmentDTO> entityListToDTOList(List<Appointment> Appointments);
}
