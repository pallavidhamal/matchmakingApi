package com.matchmaking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.matchmaking.entity.vadhuvarMaster;

@Repository
public interface CandidateRepository extends JpaRepository<vadhuvarMaster, String> {

	List<vadhuvarMaster> findByIsdeleted(String isdeleted);

	
	
	//@Query(value = "SELECT * FROM vadhuvar_master where ( maritial_status = (?1) OR (?1) IS NULL OR (?1) = '') ", nativeQuery = true)
	
	
	@Query(value = "SELECT * FROM vadhuvar.vadhuvar_master where ( maritial_status = (?1) OR (?1) IS NULL OR (?1) = '') and 	( occupation_type = (?2) OR (?2) IS NULL OR (?2) = '') and ( mangal = (?3) OR (?3) IS NULL OR (?3) = '') and 	( education = (?4) OR (?4) IS NULL OR (?4) = '') and ( native_district = (?5) OR (?5) IS NULL OR (?5) = '') and 	( working_in_city = (?6) OR (?6) IS NULL OR (?6) = '') and ( gender = (?7) OR (?7) IS NULL OR (?7) = '') and  ( age >  (?8) OR (?8) IS NULL OR (?8) = '')  and (age  < (?9) OR (?9) IS NULL OR (?9) = '') and  ( height >  (?10) OR (?10) IS NULL OR (?10) = '')  and (height  < (?11) OR (?11) IS NULL OR (?11) = '') ", nativeQuery = true)	
	List<vadhuvarMaster> getSearchCandidates(String marStatus,String Occupation ,String Mangal,String Education,String NativePlace,String OccupationCity,String Gender, int Agefrom,int Ageto, float f, float g); 
}
