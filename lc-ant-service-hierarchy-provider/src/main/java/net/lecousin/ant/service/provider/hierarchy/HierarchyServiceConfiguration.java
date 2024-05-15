package net.lecousin.ant.service.provider.hierarchy;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import net.lecousin.ant.connector.database.DatabaseConnectorConfiguration;
import net.lecousin.ant.core.springboot.service.provider.helper.LcAntServiceProviderHelperConfiguration;

@Configuration
@EnableAutoConfiguration
@Import({DatabaseConnectorConfiguration.class, LcAntServiceProviderHelperConfiguration.class})
@ComponentScan
public class HierarchyServiceConfiguration {

}
