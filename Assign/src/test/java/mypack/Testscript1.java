package mypack;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testscript1 extends Extenthelper {
	Logger log = LoggerHelper.getLogger(Testscript1.class);

	@Test
	public void am1() {
		Assert.assertTrue(true);
		log.info("am1 is passed");
	}

	@Test
	public void bm2() {
		log.info("bm2 is failed");
		Assert.assertTrue(false);
	}
	@Test
	public void cm1() {
		Assert.assertTrue(true);
		log.info("am1 is passed");
	}

	@Test
	public void dm2() {
		log.info("bm2 is failed");
		Assert.assertTrue(false);
	}
}
