package mypack;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testscript2 extends Extenthelper {
	Logger log = LoggerHelper.getLogger(Testscript2.class);

	@Test
	public void atest() {
		Assert.assertTrue(true);
		log.info("atest is passed");
	}

	@Test
	public void btest() {
		log.info("btest is failed");
		Assert.assertTrue(false);
	}
	@Test
	public void ctest() {
		Assert.assertTrue(true);
		log.info("atest is passed");
	}

	@Test
	public void dtest() {
		log.info("btest is failed");
		Assert.assertTrue(false);
	}
}
