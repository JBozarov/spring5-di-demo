package guru.springframework.examplebeans;

public class FakeJmsBroker {

	String jmsUserName; 
	String jmsPassword; 
	String jmsUrl;
	
	public String getJmsUserName() {
		return jmsUserName;
	}
	public void setJmsUserName(String jmsUserName) {
		this.jmsUserName = jmsUserName;
	}
	public String getJmsPassword() {
		return jmsPassword;
	}
	public void setJmsPassword(String jmsPassword) {
		this.jmsPassword = jmsPassword;
	}
	public String getJmsUrl() {
		return jmsUrl;
	}
	public void setJmsUrl(String jmsUrl) {
		this.jmsUrl = jmsUrl;
	}
	@Override
	public String toString() {
		return "FakeJmsBroker [jmsUserName=" + jmsUserName + ", jmsPassword=" + jmsPassword + ", jmsUrl=" + jmsUrl
				+ "]";
	}
	
	
	
}
