package com.blueway.bluewayproject.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotNull(message = "User must not be null")
    private User user;

    @NotNull(message = "You must choose a real estate")
    private RealEstate realEstate;

    @Size(min = 1, max = 5, message = "Rating must be between 1 and 5")
    @NotNull(message = "Rating must not be null")
    private int rating;
}
