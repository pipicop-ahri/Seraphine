package com.design.structure.flyweight;

/**
 * @Title: MainTest
 * @Description: TODO
 * @Author: yj
 * @Date: 2023/5/21 09:11
 * @Version: 1.0
 */
public class MainTest{
	public static void main(String[] args) {
		try {
			flyweightPatternTest();

		} catch (Exception e) {
			logError(e);
		}


	}

	private static void logError(Exception e) {
		System.out.println(e.getMessage());
	}

	private static void flyweightPatternTest() {
		AbstractWaitressFlyweight waitress = ZuDao.getWaitress("");
		waitress.getService();

		AbstractWaitressFlyweight waitress2 = ZuDao.getWaitress("");
		waitress2.getService();

		waitress2.endService();
		AbstractWaitressFlyweight waitress3 = ZuDao.getWaitress("");
		waitress3.getService();
		System.out.println("waitress3 = " + waitress3);
	}
}