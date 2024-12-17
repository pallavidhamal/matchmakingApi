package com.matchmaking.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.matchmaking.dto.CandidateResponseDto;
import com.matchmaking.entity.vadhuvarMaster;

public class CandidateMapper {
	

	public static CandidateResponseDto toCandidateResponseDto(vadhuvarMaster vEntity) {
		return CandidateResponseDto.builder()
				.id(vEntity.getId())
				.firstName(vEntity.getFirstName())
				.lastName(vEntity.getLastName())
				.birthDistrict(vEntity.getBirthDistrict())
				.birthTime(vEntity.getBirthTime())
				.bloodGroup(vEntity.getBloodGroup())
				.brothers(vEntity.getBrothers())
				.charan(vEntity.getCharan())
				.complexion(vEntity.getComplexion())
				.devak(vEntity.getDevak())
				.diet(vEntity.getDiet())
				.dOB(vEntity.getDOB())
				.education(vEntity.getEducation())
				.educationArea(vEntity.getEducationArea())
				.emailID(vEntity.getEmailID())
				.familyWealth(vEntity.getFamilyWealth())
				.father(vEntity.getFather())
				.gan(vEntity.getGan())
				.height(vEntity.getHeight())
				.ifyes(vEntity.getIfyes())
				.income(vEntity.getIncome())
				.intercastMarriage(vEntity.getIntercastMarriage())
				.kycDoc(vEntity.getKycDoc())
				.lens(vEntity.getLens())
				.mamasSurPlace(vEntity.getMamasSurPlace())
				.mangal(vEntity.getMangal())
				.maritialStatus(vEntity.getMaritialStatus())
				.marriedBrothers(vEntity.getMarriedBrothers())
				.marriedSisters(vEntity.getMarriedSisters())
				.middleName(vEntity.getMiddleName())
				.contactPerson(vEntity.getContactPerson())
				.mobileII(vEntity.getMobileII())
				.mother(vEntity.getMother())	
				.nadi(vEntity.getNadi())
				.nakshatra(vEntity.getNakshatra())
				.nativeDistrict(vEntity.getNativeDistrict())
				.nativeTaluka(vEntity.getNativeTaluka())
				.occupationDetails(vEntity.getOccupationDetails())
				.occupationType(vEntity.getOccupationType())
				.parentsFullname(vEntity.getParentsFullname())
				.parentsOccupation(vEntity.getParentsOccupation())
				.parentsResidentCity(vEntity.getParentsResidentCity())
				.personality(vEntity.getPersonality())
				.phoneI(vEntity.getPhoneI())
				.phoneII(vEntity.getPhoneII())
				.profilepicture_path1(vEntity.getProfilepicture_path1())
				.pysicalDisablities(vEntity.getPysicalDisablities())
				.pysicalDisDesc(vEntity.getPysicalDisDesc())
				.rashi(vEntity.getRashi())
				.residenceAddress(vEntity.getResidenceAddress())
				.sisters(vEntity.getSisters())
				.spectacles(vEntity.getSpectacles())
				.subCast(vEntity.getSubCast())
				.surnamesofRelatives(vEntity.getSurnamesofRelatives())
				.weight(vEntity.getWeight())
				.workingInCity(vEntity.getWorkingInCity())
				.gender(vEntity.getGender())
				.prefAge(vEntity.getPrefAge())
				.prefCaste(vEntity.getPrefCaste())
				.prefCity(vEntity.getPrefCity())
				.prefDivorce(vEntity.getPrefDivorce())
				.prefHt(vEntity.getPrefHt())
				.prefMangal(vEntity.getPrefMangal())
				.prefEdu(vEntity.getPrefEdu())
				.prefOcuu(vEntity.getPrefOcuu())
				.perOther(vEntity.getPerOther())
				.famOther(vEntity.getFamOther())
				.expOther(vEntity.getExpOther())
				
				.build();
		
	}
	
	public static List<CandidateResponseDto> toCategoryResponseDtosListForTable(List<vadhuvarMaster> vEntities) {
		// TODO Auto-generated method stub	vEntity
		List<CandidateResponseDto> candidateResponseDto = new ArrayList<CandidateResponseDto>();
		for(vadhuvarMaster vMaster : vEntities) {
			candidateResponseDto.add(toCandidateResponseDto(vMaster));			
		}	
		return candidateResponseDto;
	}
	
}