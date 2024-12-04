package com.matchmaking.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@AllArgsConstructor
public class CandidateRequestDto {
	
	
	private String gender ;
	private String marritalStatus ; //
	private int ageFrom ;
	private int ageTo; 
	private String occupation ; //
	private String mangal ; //
	private String education ;//
	private String occupationCity;//
	private String nativePlace;//
	private float htFrom ;
	private float htTo;
	

}
