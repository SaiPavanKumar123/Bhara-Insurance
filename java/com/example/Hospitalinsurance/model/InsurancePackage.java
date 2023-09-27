package com.example.Hospitalinsurance.model;

public class InsurancePackage {
	private int inspId;
	private String inspTitle;
	private String inspDescription;
	private String inspStatus;
	private double inspRangeStart;
	private double inspRangeEnd;
	private int inspAgeLimitStart;
	private int inspAgeLimitEnd;

	public InsurancePackage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsurancePackage(int inspId, String inspTitle, String inspDescription, String inspStatus,
			double inspRangeStart, double inspRangeEnd, int inspAgeLimitStart, int inspAgeLimitEnd) {
		super();
		this.inspId = inspId;
		this.inspTitle = inspTitle;
		this.inspDescription = inspDescription;
		this.inspStatus = inspStatus;
		this.inspRangeStart = inspRangeStart;
		this.inspRangeEnd = inspRangeEnd;
		this.inspAgeLimitStart = inspAgeLimitStart;
		this.inspAgeLimitEnd = inspAgeLimitEnd;
	}

	public int getInspId() {
		return inspId;
	}

	public void setInspId(int inspId) {
		this.inspId = inspId;
	}

	public String getInspTitle() {
		return inspTitle;
	}

	public void setInspTitle(String inspTitle) {
		this.inspTitle = inspTitle;
	}

	public String getInspDescription() {
		return inspDescription;
	}

	public void setInspDescription(String inspDescription) {
		this.inspDescription = inspDescription;
	}

	public String getInspStatus() {
		return inspStatus;
	}

	public void setInspStatus(String inspStatus) {
		this.inspStatus = inspStatus;
	}

	public double getInspRangeStart() {
		return inspRangeStart;
	}

	public void setInspRangeStart(double inspRangeStart) {
		this.inspRangeStart = inspRangeStart;
	}

	public double getInspRangeEnd() {
		return inspRangeEnd;
	}

	public void setInspRangeEnd(double inspRangeEnd) {
		this.inspRangeEnd = inspRangeEnd;
	}

	public int getInspAgeLimitStart() {
		return inspAgeLimitStart;
	}

	public void setInspAgeLimitStart(int inspAgeLimitStart) {
		this.inspAgeLimitStart = inspAgeLimitStart;
	}

	public int getInspAgeLimitEnd() {
		return inspAgeLimitEnd;
	}

	public void setInspAgeLimitEnd(int inspAgeLimitEnd) {
		this.inspAgeLimitEnd = inspAgeLimitEnd;
	}

	@Override
	public String toString() {
		return "InsurancePackage [inspId=" + inspId + ", inspTitle=" + inspTitle + ", inspDescription="
				+ inspDescription + ", inspStatus=" + inspStatus + ", inspRangeStart=" + inspRangeStart
				+ ", inspRangeEnd=" + inspRangeEnd + ", inspAgeLimitStart=" + inspAgeLimitStart + ", inspAgeLimitEnd="
				+ inspAgeLimitEnd + "]";
	}
}