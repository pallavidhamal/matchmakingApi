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
public class CandidateResponseDto {
	
	private String id;
	private String firstName ;
	private String middleName ;
	private String lastName ;
	private Date dOB; 
	private String subCast ;
	private String maritialStatus ;
	private float height ;
	private int weight ;
	private String bloodGroup ;
	private String complexion ;
	private String pysicalDisablities ;
	private String pysicalDisDesc ;
	private String diet ;
	private String spectacles ;
	private String lens ;
	private String personality; 

	private String rashi ;
	private String nakshatra ;
	private String charan ;
	private String nadi ;
	private String gan ;
	private String mangal ;
	private Date birthTime ;
	private String birthDistrict;
	private String devak ;

	private String educationArea ;
	private String education ;
	private String occupationType;
	private String occupationDetails ;
	private String workingInCity;
	private int income ;

	private String kycDoc ;
	private String residenceAddress ;
	private String emailID;
	private String contactPerson;
	private String mobileII ;
	private String phoneI ;
	private String phoneII ;


	private String father; 
	private String mother ;
	private String brothers ;
	private int marriedBrothers ;
	private String sisters ;
	private int marriedSisters ;
	private String parentsFullname ;
	private String parentsOccupation ;
	private String parentsResidentCity ;
	private String surnamesofRelatives ;
	 

	private String familyWealth;
	private String mamasSurPlace ;
	private String nativeDistrict;
	private String nativeTaluka ;
	private String intercastMarriage;
	
	private String ifyes ;
	private String gender ;
	
	
	private String prefCity;
	private String prefMangal;
	private String prefCaste;
	private String prefAge;
	private String prefHt;
	private String prefEdu;
	private String prefOcuu;
	private String prefDivorce;
	
	private String perOther;
	private String famOther;
	private String expOther;

	/*
	Preferred Cities 
	Mangal 
	Expected Caste 
	Max Age Difference 
	Expected Height 
	Expected Education 
	Expected Occupation & Income per Annum 
	Divorcee */

	private String profilepicture_path1;
	private String profilepicture_path2;

}
