package br.com.fiap.health4me.mappers;

import java.util.Set;

import org.mapstruct.Mapper;

import br.com.fiap.health4me.dtos.RegisterDTO;
import br.com.fiap.health4me.models.Register;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface RegisterMapper {

    Register dtoToEntity(RegisterDTO acccountDTO);

    RegisterDTO entityToDTO(Register Register);

    Set<RegisterDTO> entityListToDTOList(Set<Register> Registers);
}
