package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

	@Value("${guru.username}")
	String user; 
	
	@Value("${guru.password}")
	String password;
	
	@Value("${guru.dburl}")
	String url; 
	
	@Value("${guru.jms.username}")
	String jmsUserName;
	
	@Value("${guru.jms.password}")
	String jmsPassword; 
	
	@Value("${guru.jms.dburl}")
	String jmsUrl; 
	
	@Bean
	public FakeDataSource fakeDataSource () {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource; 
	}
	
	@Bean
	public FakeJmsBroker getFakeJmsBroker() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker(); 
		fakeJmsBroker.setJmsUserName(jmsUserName);
		fakeJmsBroker.setJmsPassword(jmsPassword);
		fakeJmsBroker.setJmsUrl(jmsUrl);
		return fakeJmsBroker; 
	}
	
}
