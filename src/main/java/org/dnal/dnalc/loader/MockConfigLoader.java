package org.dnal.dnalc.loader;

import org.dnal.dnalc.ConfigFileLoader;
import org.dnal.dnalc.ConfigFileOptions;

public class MockConfigLoader implements ConfigFileLoader {
	public ConfigFileOptions options;
	@Override
	public ConfigFileOptions load(String path) {
		return options;
	}
	@Override
	public boolean existsConfigFile(String arg0) {
		return true;
	}
	
}