package com.blueway.bluewayproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@AllArgsConstructor
@Data
@Document(collection = "votingStatus")
public class VotingStatus {

    private long totalVotes;
    private Map<String, Long> votesByRealEstate;
}
