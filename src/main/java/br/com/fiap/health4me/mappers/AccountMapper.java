package br.com.fiap.health4me.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.fiap.health4me.dtos.AccountDTO;
import br.com.fiap.health4me.models.Account;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface AccountMapper {

    Account dtoToEntity(AccountDTO acccountDTO);

    AccountDTO entityToDTO(Account account);

    List<AccountDTO> entityListToDTOList(List<Account> accounts);
}
