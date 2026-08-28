package com.tca.bean;

public class PdfReportCreater implements ReportCreater{

	@Override
	public void reportCreter(int page) {
		
		System.out.println("This is the pdf report creater no of pages are "+page);
	}
            
}
