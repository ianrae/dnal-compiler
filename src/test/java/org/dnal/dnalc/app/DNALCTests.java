package org.dnal.dnalc.app;

import static org.junit.Assert.assertEquals;

import org.dnal.dnalc.ConfigFileOptions;
import org.dnal.dnalc.loader.MockConfigLoader;
import org.dnal.dnalc.Application;
import org.junit.Test;



public class DNALCTests {

	@Test
	public void testVersion() {
		String[] args = new String[] { "--version"  };
		chkRun(args);
	}
	
	private void chkRun(String[] args) {
		MockConfigLoader configLoader = createConfigLoader();
		Application dnalc = new Application(configLoader);
		dnalc.run(args);
		assertEquals(true, dnalc.wasSuccessful());
	}
	
	private MockConfigLoader createConfigLoader() {
		MockConfigLoader loader = new MockConfigLoader();
		loader.options = new ConfigFileOptions();
		loader.options.outputPath = "mytypes";
		loader.options.outputType = "java/dnal";
		return loader;
//		if (!useOptions) {
//			loader.options = null;
//		}
//		return loader;
	}

}
