package com.marinho.peopleapi.dto.request;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder

public class PersonDTO {
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;
    @NotEmpty
    @Size(min = 2, max = 200)
    private String lastName;
    @NotEmpty
    @CPF
    private String cpf;

    private LocalDate birthDate;
    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;

}
