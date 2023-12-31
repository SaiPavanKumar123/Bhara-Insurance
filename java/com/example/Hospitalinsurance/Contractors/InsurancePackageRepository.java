package com.example.Hospitalinsurance.Contractors;

import java.util.List;

import com.example.Hospitalinsurance.model.Categories;
import com.example.Hospitalinsurance.model.DiseaseDetails;
import com.example.Hospitalinsurance.model.InsurancePackage;
import com.example.Hospitalinsurance.model.InsurancePackageCoveredDisease;

public interface InsurancePackageRepository {
	List<InsurancePackage> getAllInsurancePackages();

	List<InsurancePackageCoveredDisease> getCoveredDiseasesByPackageId(int packageId);

	DiseaseDetails getDiseaseDetailsById(int discId);

	List<InsurancePackage> getFilteredPackages(String status, int age);

	List<InsurancePackage> getPackagesByStatus(String status);

	List<InsurancePackage> getAllInsurancePackagesByAge(int parseInt);

	List<DiseaseDetails> getDiseasesByPackageId(int id);

	int addDisease(String name, String iCDCode, String description, String status, int disid);

	int deleteDisease(int parseInt, int parseInt2);

	String editDisease(String name, String iCDCode, String description, String status, String Id);

	List<Categories> getCategoriesByPackageId(int inspId);

	int deleteCategory(int did, int inspid);

	int addCategory(String name, String title, String description, String string, int parseInt);

	String editCategory(String title, String description, String status);

	int deletePackage(int did);

	// -----------------------------------------------------------------------------------------
	String editPackage(String id, String title, String description, String status, String rangeStart, String rangeEnd,
			String ageLimitStrt, String ageLimitEnd);

	void addPackage(InsurancePackage insp);
}