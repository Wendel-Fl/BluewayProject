package com.blueway.bluewayproject.model;

import jakarta.validation.constraints.NotBlank;
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

    private User user;

    private RealEstate realEstate;

    private String vote;
}
