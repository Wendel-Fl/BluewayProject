package com.blueway.bluewayproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "Name must not be null")
    @Pattern(regexp = "^[A-Z]+(.)*")
    private String name;

    @Size(min = 11, max = 11, message = "CPF must have 11 characters")
    @NotNull(message = "CPF must not be null")
    @CPF(message = "CPF must be valid")
    private String cpf;

    public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}
