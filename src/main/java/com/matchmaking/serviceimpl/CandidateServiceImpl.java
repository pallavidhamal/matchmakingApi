package com.matchmaking.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matchmaking.dto.CandidateRequestDto;
import com.matchmaking.dto.CandidateResponseDto;
import com.matchmaking.dto.mapper.CandidateMapper;
import com.matchmaking.entity.vadhuvarMaster;
import com.matchmaking.repository.CandidateRepository;
import com.matchmaking.service.CandidateService;


@Service
public class CandidateServiceImpl implements  CandidateService {

	@Autowired
	CandidateRepository candidateRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(CandidateServiceImpl.class);

	
	
	@Override
	public List<CandidateResponseDto> getAllCandidates() {
		// TODO Auto-generated method stub
		 
		List<vadhuvarMaster>	vEntities = candidateRepository.findAll();		
		return CandidateMapper.toCategoryResponseDtosListForTable(vEntities);
	}



	@Override
	public List<CandidateResponseDto> getSearchCandidates(CandidateRequestDto candidateRequestDto) {
		// TODO Auto-generated method stub
		
		System.out.println("mar sts==="+candidateRequestDto.getMarritalStatus());
		
		List<vadhuvarMaster>	vEntities = candidateRepository.getSearchCandidates(candidateRequestDto.getMarritalStatus(),candidateRequestDto.getOccupation(),
				candidateRequestDto.getMangal(),candidateRequestDto.getEducation(),candidateRequestDto.getNativePlace(),candidateRequestDto.getOccupationCity(),candidateRequestDto.getGender(),candidateRequestDto.getAgeFrom(),candidateRequestDto.getAgeTo(),candidateRequestDto.getHtFrom(),candidateRequestDto.getHtTo());
		
		System.out.println("search result==="+vEntities.toString());
		
		System.out.println("search result size==="+vEntities.size());
		
		return CandidateMapper.toCategoryResponseDtosListForTable(vEntities);
	}



	@Override
	public CandidateResponseDto getCandidateById(String id) {
		// TODO Auto-generated method stub
		
		System.out.println("get candidate id==="+id);
		Optional<vadhuvarMaster>	vEntities = candidateRepository.findById(id);
		vadhuvarMaster	vEntity =vEntities.get();
		System.out.println("search result==="+vEntity.toString());
		return CandidateMapper.toCandidateResponseDto(vEntity);
	}

}
