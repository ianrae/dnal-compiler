DNALC - Compiler for DNAL
=======

A compiler for the DNAL language (https://github.com/ianrae/dnal-lang)

This project creates a single executable jar.  It can be used to run dnalc from the command line.

This project can also be used to add custom generators to dnalc.

*Latest version*: 0.2.0 (requires Java 8+)


## How to Use?

Fork this project.  Build it 

    mvn clean package assembly:single
   
Copy dnalc-0.2.0-jar-with-dependencies.jar to the example directory.  Run it using ss.bat or by invoking

    java -jar dnalc-0.2.0-jar-with-dependencies.jar g -t=text/custom struct1.dnal


