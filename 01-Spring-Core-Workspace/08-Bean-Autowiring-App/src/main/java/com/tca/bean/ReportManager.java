package com.tca.bean;

public class ReportManager {
	private ReportCreater reportCreater;
	private int page;

	public void setReportCreater(ReportCreater reportCreater) {
		this.reportCreater = reportCreater;
	}

	public ReportManager() {

	}

	public void setPage(int page) {
		this.page = page;
	}

	public ReportManager(ReportCreater reportCreater) {

		this.reportCreater = reportCreater;
	}

	public void makeReport() {
		reportCreater.reportCreter(page);
	}
}
