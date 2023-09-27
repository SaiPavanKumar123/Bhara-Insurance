package com.example.Hospitalinsurance.Contractors;

import java.util.List;

import com.example.Hospitalinsurance.model.Categories;
import com.example.Hospitalinsurance.model.DiseaseDetails;
import com.example.Hospitalinsurance.model.InsurancePackage;
import com.example.Hospitalinsurance.model.InsurancePackageCoveredDisease;

public interface InsurancePackageDAO {
	List<InsurancePackage> getAllInsurancePackages();

	List<InsurancePackageCoveredDisease> getCoveredDiseasesByPackageId(int packageId);

	DiseaseDetails getDetailsByDiseaseId(int discId);

	List<InsurancePackage> getFiteredDiseases(String status, int age);

	List<InsurancePackage> getPackagesByStatus(String status);

	List<InsurancePackage> getAllInsurancePackagesByAge(int age);

	List<DiseaseDetails> getDiseasesByPackageId(int id);

	int addDisease(String name, String iCDCode, String description, String status, int inspid);

	int deleteDisease(int did, int inspid);

	String editDisease(String name, String iCDCode, String description, String status, Integer Id);

	List<Categories> getCategoriesByPackageId(int inspId);

	int deleteCategory(int did, int inspid);

	int addCategory(String name, String title, String description, String string, int parseInt);

	String editCategory(String title, String description, String status);

	int deletePackage(int did);

	String editPackage(String id, String title, String description, String status, String rangeStart, String rangeEnd,
			String ageLimitStrt, String ageLimitEnd);

	void addPackage(InsurancePackage insp);
}