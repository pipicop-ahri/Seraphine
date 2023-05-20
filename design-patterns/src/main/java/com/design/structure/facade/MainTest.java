package com.design.structure.facade;

/**
 * Facade Pattern
 * 场景：生了小孩后既要到公安局办户口、又要到教育局办入学手续、还要到社保局转移社保...这样每个地方都要跑一趟很麻烦，就弄一个政府大楼，里面对外提供这些所有的服务，下次我只需要到这个政府大楼里去就可以了。
 * 	类似的，前端应用调后台不可能记住每个服务的地址，而网关就是这个外观模式的实现，外部请求全部经过网关，由网关负责转发调用。
 *
 * @Title: MainTest
 * @Description: 外观模式
 * @Author: yj
 * @Date: 2023/5/20 21:02
 * @Version: 1.0
 */
public class MainTest {
	public static void main(String[] args) {
		//需要记住每个对象，来调用它们的方法
		//办户口
		// PoliceStation policeStation = new PoliceStation();
		// policeStation.newPeople("janna");
		// //办社保
		// SocialSecurity socialSecurity = new SocialSecurity();
		// socialSecurity.getSocialSecurity("janna");
		// //办入学
		// EducationBureau educationBureau = new EducationBureau();
		// educationBureau.getSchool("janna");

		//外观模式 只需要创建一次对象
		GovernmentFacade governmentFacade = new GovernmentFacade();
		governmentFacade.getSchool("janna");
		governmentFacade.getSocialSecurity("janna");
		governmentFacade.newPeople("janan");


	}
}