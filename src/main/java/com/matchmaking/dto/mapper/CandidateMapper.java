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
				.Brothers(vEntity.getBrothers())
				.Charan(vEntity.getCharan())
				.Complexion(vEntity.getComplexion())
				.Devak(vEntity.getDevak())
				.Diet(vEntity.getDiet())
				.DOB(vEntity.getDOB())
				.Education(vEntity.getEducation())
				.educationArea(vEntity.getEducationArea())
				.emailID(vEntity.getEmailID())
				.FamilyWealth(vEntity.getFamilyWealth())
				.Father(vEntity.getFather())
				.Gan(vEntity.getGan())
				.Height(vEntity.getHeight())
				.ifyes(vEntity.getIfyes())
				.Income(vEntity.getIncome())
				.IntercastMarriage(vEntity.getIntercastMarriage())
				.kycDoc(vEntity.getKycDoc())
				.Lens(vEntity.getLens())
				.MamasSurPlace(vEntity.getMamasSurPlace())
				.Mangal(vEntity.getMangal())
				.maritialStatus(vEntity.getMaritialStatus())
				.MarriedBrothers(vEntity.getMarriedBrothers())
				.MarriedSisters(vEntity.getMarriedSisters())
				.middleName(vEntity.getMiddleName())
				.mobileForSMSAlert(vEntity.getMobileForSMSAlert())
				.mobileII(vEntity.getMobileII())
				.Mother(vEntity.getMother())	
				.Nadi(vEntity.getNadi())
				.Nakshatra(vEntity.getNakshatra())
				.NativeDistrict(vEntity.getNativeDistrict())
				.NativeTaluka(vEntity.getNativeTaluka())
				.occupationDetails(vEntity.getOccupationDetails())
				.occupationType(vEntity.getOccupationType())
				.ParentsFullname(vEntity.getParentsFullname())
				.ParentsOccupation(vEntity.getParentsOccupation())
				.ParentsResidentCity(vEntity.getParentsResidentCity())
				.Personality(vEntity.getPersonality())
				.PhoneI(vEntity.getPhoneI())
				.PhoneII(vEntity.getPhoneII())
				.profilepicture_path1(vEntity.getProfilepicture_path1())
				.pysicalDisablities(vEntity.getPysicalDisablities())
				.pysicalDisDesc(vEntity.getPysicalDisDesc())
				.Rashi(vEntity.getRashi())
				.residenceAddress(vEntity.getResidenceAddress())
				.Sisters(vEntity.getSisters())
				.Spectacles(vEntity.getSpectacles())
				.subCast(vEntity.getSubCast())
				.SurnamesofRelatives(vEntity.getSurnamesofRelatives())
				.Weight(vEntity.getWeight())
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