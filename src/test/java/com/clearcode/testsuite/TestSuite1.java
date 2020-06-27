package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.AllProperties;
import com.clearcode.po.DashBoard;
import com.clearcode.po.Features;
import com.clearcode.po.HomePage;

import com.clearcode.po.Propertysettings;
import com.clearcode.po.Regions;

import dataProvider.LoginData;



public class TestSuite1 extends TestSetup {

	@Test(dataProvider="RealEstate",dataProviderClass=LoginData.class)
	public void RealEstate(String Description , String nameid , String slugid , String data , String Descriptions) throws InterruptedException {
		
//		wdu.mouseOver(MenuBar.patient_men
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, title);
//		wdu.type(PatientPage.fname_ip, fname);
//		wdu.type(PatientPage.lname_ip, lname);
		Thread.sleep(3000);
		
		wdu.type(HomePage.username_ip,"admin");
	    wdu.type(HomePage.pwd_ip,"admin@123");
		wdu.click(HomePage.signin_btn);
		wdu.mouseOver(DashBoard.properties_mv);
		wdu.click(AllProperties.Allproperties_clk);
		wdu.mouseOver(DashBoard.properties_mv);
		wdu.click(DashBoard.Addnew_clk);
		wdu.mouseOver(DashBoard.properties_mv);
		wdu.click(Features.Features_clk);
		wdu.mouseOver(DashBoard.properties_mv);
		wdu.click(Regions.Regions_clk);
		wdu.type(Regions.Fname_ip,nameid);
		wdu.type(Regions.slug_ip, slugid);
		wdu.selectByVisibleText(Regions.Regionselect, data);
		wdu.type(Regions.Desc, Descriptions);
		wdu.mouseOver(DashBoard.properties_mv);
		wdu.click(Propertysettings.Propertysettings);
		
		}}


