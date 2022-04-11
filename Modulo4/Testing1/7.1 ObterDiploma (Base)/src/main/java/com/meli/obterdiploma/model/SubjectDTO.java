package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {


    @NotEmpty(message = "O nome do aluno não pode ficar vazio.")
    @Size(max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    //@Pattern(regexp = "^[A-Z].*$", message = "O nome do assunto deve começar com letra maiúscula.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do assunto deve começar com letra maiúscula.")
    String name;

    @NotNull(message = "A nota não pode estar vazia.")
    @Max(value = 10, message = "A nota maxima é 10.0.")
    @Min(value = 0,message = "A nota minima é 0.0.")
    Double score;
}
