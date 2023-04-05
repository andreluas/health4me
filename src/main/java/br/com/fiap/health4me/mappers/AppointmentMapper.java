package br.com.fiap.health4me.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.fiap.health4me.dtos.AppointmentDTO;
import br.com.fiap.health4me.models.Appointment;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface AppointmentMapper {

    Appointment dtoToEntity(AppointmentDTO acccountDTO);

    AppointmentDTO entityToDTO(Appointment Appointment);

    List<AppointmentDTO> entityListToDTOList(List<Appointment> Appointments);
}
