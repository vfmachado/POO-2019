package nested.classes;

public class Config {

	public enum BD {
		local, remote;
	}
	
	public enum userType {
		normal, admin;
	}
	
	public enum possibleHosts {
		
		localhost("127.0.0.1"),
		google(""),
		facebook("");
		
		private String value;
		private possibleHosts(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
