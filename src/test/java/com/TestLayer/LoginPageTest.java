package com.TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	@Parameters({ "browsername" })
	@BeforeTest
	public void setUp(String abc) {
		BaseClass.initialization(abc);

	}

	@Test
	public void valiateLoginFunctionality() {
		LoginPage lp = new LoginPage();
		lp.loginFunctionality("Admin", "admin123");

	}

}
