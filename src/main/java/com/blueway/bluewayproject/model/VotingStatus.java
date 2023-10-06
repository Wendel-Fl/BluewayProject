package com.blueway.bluewayproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@AllArgsConstructor
@Data
public class VotingStatus {

    private long totalVotes;
    private Map<String, Long> votesByRealEstate;
}
