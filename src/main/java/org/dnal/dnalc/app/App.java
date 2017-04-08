package org.dnal.dnalc.app;

import org.dnal.dnalc.Application;
import org.dnal.dnalc.ConfigFileLoaderImpl;

/**
 * @author ian
 *
 */
public class App {

	public static void main(String[] args) {
		Application app = new Application(new ConfigFileLoaderImpl());
		app.registerGenerator("text/custom", new CustomGenerator());
		app.run(args);
	}


}