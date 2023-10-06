package com.blueway.bluewayproject.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "ratings")
public class Rating {

    @Id
    private String id;

    @NotBlank
    private User user;

    @NotNull
    private RealEstate realEstate;

    @NotBlank
    private String vote;
}
