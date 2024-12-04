package com.matchmaking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matchmaking.dto.CandidateRequestDto;
import com.matchmaking.dto.response.Response;
import com.matchmaking.service.CandidateService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/matchmaking")
public class CandidateController {
	
	@Autowired
	CandidateService candService;
//	list all Products for select box
	
	@RequestMapping(value = "/getCandidates", method = RequestMethod.GET, headers = "Accept=application/json")
	public Response getCandidates() {		
		
		System.out.println("hi in getCandidates");
		return Response.ok().setPayload(candService.getAllCandidates());
		
	}

	@RequestMapping(value = "/searchCandidates", method = RequestMethod.POST, headers = "Accept=application/json")
	public Response searchCandidates(@RequestBody CandidateRequestDto candidateRequestDto) {		
		
		System.out.println("hi in searchCandidates");
		return Response.ok().setPayload(candService.getSearchCandidates(candidateRequestDto));
		
	}
	
	@RequestMapping(value = "/getCandidateById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Response getCandidateById(@PathVariable String id) {		
		
		System.out.println("hi in getCandidateById");
		return Response.ok().setPayload(candService.getCandidateById(id));
		
	}
	
	
	
	/*
	 * @SuppressWarnings("rawtypes")
	 * 
	 * @PostMapping( value = "/addPurchaseAndProductData" , consumes =
	 * APPLICATION_JSON_VALUE) public Response
	 * addPurchaseAndProductData(@Valid @RequestBody PurchaseIncomingDto
	 * purchaseIncomingDto) {
	 * 
	 * 
	 * 
	 * logger.info("----- PurchaseController addPurchaseAndProductData ----");
	 * return Response.ok().setPayload(purchaseService.addPurchaseAndProductData(
	 * purchaseIncomingDto)) ; }
	 */
	
	
	
}




