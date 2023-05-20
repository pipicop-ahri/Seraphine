package com.design.structure.facade;

/**
 * @Title: GovernmentFacade
 * @Description: 外观模式：政府大楼
 * @Author: yj
 * @Date: 2023/5/20 21:17
 * @Version: 1.0
 */
public class GovernmentFacade {

	private EducationBureau educationBureau = new EducationBureau();
	private PoliceStation policeStation = new PoliceStation();
	private SocialSecurity socialSecurity = new SocialSecurity();


	public void getSchool(String name){
		educationBureau.getSchool(name);
	}

	public void newPeople(String name){
		policeStation.newPeople(name);
	}

	public void getSocialSecurity(String name){
		socialSecurity.getSocialSecurity(name);
	}
}