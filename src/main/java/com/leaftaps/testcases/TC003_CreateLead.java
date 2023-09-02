package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.LoginPage;

public class TC003_CreateLead extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Lead";
		testDescription ="Create Lead to Leaftaps";
		authors="Babu";
		category ="DevQAOps Practise";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin();

	}

}
