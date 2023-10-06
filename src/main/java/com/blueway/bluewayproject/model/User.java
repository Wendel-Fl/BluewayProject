package com.blueway.bluewayproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @JsonIgnore
    private String id;

    @Size(min = 3, max = 50, message = "Name must have between 3 and 50 characters")
    @NotBlank(message = "Name must not be null")
    @Pattern(regexp = "^[A-Z]+(.)*")
    private String name;

    @Size(min = 11, max = 11, message = "CPF must have 11 characters")
    @NotBlank(message = "CPF must not be null")
    @CPF(message = "CPF must be valid")
    private String cpf;

}
