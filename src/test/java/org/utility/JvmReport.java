package org.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvumReport(String jsonpath) {
		File f=new File(System.getProperty("user.dir")+"//target//reports//JvmReport");
		Configuration con=new Configuration(f, "facebook project");
		con.addClassifications("Browser name","Chrome");
		con.addClassifications("Browser version","104");
		con.addClassifications("Os name","windows");
		con.addClassifications("Os version","10");
		con.addClassifications("sprint name","22");
		
		List<String> li=new ArrayList<String>();
		li.add(jsonpath);
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
		

	}

}
