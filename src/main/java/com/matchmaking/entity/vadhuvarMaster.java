package com.matchmaking.entity;

import java.util.Date;

import com.matchmaking.entity.id.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "vadhuvarMaster")
public class vadhuvarMaster extends BaseEntity {
	
	
	private String firstName ;
	private String middleName ;
	private String lastName ;
	private Date DOB; 
	private String subCast ;
	private String maritialStatus ;
	private int Height ;
	private int Weight ;
	private String bloodGroup ;
	private String Complexion ;
	private String pysicalDisablities ;
	private String pysicalDisDesc ;
	private String Diet ;
	private String Spectacles ;
	private String Lens ;
	private String Personality; 

	private String Rashi ;
	private String Nakshatra ;
	private String Charan ;
	private String Nadi ;
	private String Gan ;
	private String Mangal ;
	private Date birthTime ;
	private String birthDistrict;
	private String Devak ;

	private String educationArea ;
	private String Education ;
	private String occupationType;
	private String occupationDetails ;
	private String workingInCity;
	private int Income ;

	private String kycDoc ;
	private String residenceAddress ;
	private String emailID;
	private String mobileForSMSAlert;
	private String mobileII ;
	private String PhoneI ;
	private String PhoneII ;


	private String Father; 
	private String Mother ;
	private int Brothers ;
	private int MarriedBrothers ;
	private int Sisters ;
	private int MarriedSisters ;
	private String ParentsFullname ;
	private String ParentsOccupation ;
	private String ParentsResidentCity ;
	private String SurnamesofRelatives ;
	 

	private String FamilyWealth;
	private String MamasSurPlace ;
	private String NativeDistrict;
	private String NativeTaluka ;
	private String IntercastMarriage;
	
	private String ifyes ;

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
