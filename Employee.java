package practice;

public class Employee {
		private String name;
		private String num;
		private String ssn;
		
		
		Employee (String name, String num, String ssn) {
			this.name =name;
			this.num=num;
			this.ssn=ssn;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		
}
