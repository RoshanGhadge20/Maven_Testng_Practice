package Maven_build_mgnt;

import org.openqa.selenium.safari.SafariTechPreviewDriverService;

public class build_mgmt
{
	/*
	 * Steps
	 * 1. Create a testng project with few @Test method 
	 * 2. go to create testng.xml file from that project 
	 * 3. add profile to the pom.xml file  & add surefly plugin
	 * Ex:- 
	 * <profiles>
		<profile>
			<id>DataProvider</id>
			<build>
				<pluginManagement>
					<plugins>
						<plugin>
							<groupId>org.apache.maven.plugins</groupId>
							<artifactId>maven-surefire-plugin</artifactId>
							<version>3.2.5</version>
							<configuration>
								<suiteXmlFiles>
									<suiteXmlFile>testng.xml</suiteXmlFile>
								</suiteXmlFiles>
							</configuration>
						</plugin>
					</plugins>
				</pluginManagement>
			</build>
		</profile>
		
		
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-surefire-plugin</artifactId>
		<version>3.2.5</version>
		<configuration>
		
		
	 * 4 install maven & set up with the enviromental variablbes 
	 * 5 access it through the command terminal 
	 * 
	 * 
	 */
}
