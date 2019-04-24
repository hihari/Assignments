package mypack;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Testscript3 {
	String uid;
	String pwd;
	
	@Factory(dataProvider="ExcelTestData",dataProviderClass=ExcelHelper.class)
	Testscript3(String uid,String pwd){
		this.uid = uid;
		this.pwd = pwd;
	}
	
	@Test
	public void atestdata1() {
		System.out.println(uid);
	}

	@Test
	public void btestdata2() {
		System.out.println(pwd);
	}
}
