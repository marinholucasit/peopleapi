package com.marinho.peopleapi.dto.request;

import com.marinho.peopleapi.enums.PhoneType;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
public class PhoneDTO {

    private Long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    @NotEmpty
    @Size(min=13, max=14)
    private String number;
}
