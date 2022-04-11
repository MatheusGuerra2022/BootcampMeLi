package com.meli.obterdiploma.model;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {



    @NotEmpty(message = "O nome do aluno não pode ficar vazio.")
    @Size(max = 50, message = "O comprimento do nome não pode exceder 50 caracteres.")
    //@Pattern(regexp = "^[A-Z].*$", message = "O nome do aluno deve começar com letra maiúscula.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do aluno deve começar com letra maiúscula.")
    String studentName;

    String message;
    Double averageScore;


    @NotEmpty(message = "A lista não pode estar vazia.")
    List<@Valid SubjectDTO> subjects;
}
