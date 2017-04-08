
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_101

echo setting Maven..
path = %path%;C:\iantools\maven\apache-maven-3.3.9\bin;C:\Program Files (x86)\GnuPG\bin

rem pause
rem create new app. run this in parent dir. it creates the project subdir
rem mvn archetype:generate -DgroupId=com.github.ianrae -DartifactId=dnalparse -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false