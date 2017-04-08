package org.dnal.dnalc.app;


import org.dnal.dnalc.Application;
import org.dnal.dnalc.ConfigFileOptions;
import org.dnal.dnalc.loader.MockConfigLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.run(args);
    }
    
	private void run(String[] args) {
		MockConfigLoader configLoader = createConfigLoader();
		Application dnalc = new Application(configLoader);
		dnalc.run(args);
		
//		assertEquals(true, dnalc.wasSuccessful());
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
