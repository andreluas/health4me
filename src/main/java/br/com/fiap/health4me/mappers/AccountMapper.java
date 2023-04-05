package br.com.fiap.health4me.mappers;

import java.util.Set;

import org.mapstruct.Mapper;

import br.com.fiap.health4me.dtos.AccountDTO;
import br.com.fiap.health4me.models.Account;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface AccountMapper {

    Account dtoToEntity(AccountDTO acccountDTO);

    AccountDTO entityToDTO(Account account);

    Set<AccountDTO> entityListToDTOList(Set<Account> accounts);
}
