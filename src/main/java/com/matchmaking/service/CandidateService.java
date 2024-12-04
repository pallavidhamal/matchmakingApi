package com.matchmaking.service;

import java.util.List;

import com.matchmaking.dto.CandidateRequestDto;
import com.matchmaking.dto.CandidateResponseDto;

public interface  CandidateService {

	List<CandidateResponseDto> getAllCandidates();

	List<CandidateResponseDto> getSearchCandidates(CandidateRequestDto candidateRequestDto);

	CandidateResponseDto getCandidateById(String id);
	
}
