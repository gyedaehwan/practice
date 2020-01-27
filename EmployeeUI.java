package practice;

import java.util.*;

public class EmployeeUI {
	
	Scanner sc = new Scanner(System.in);
	EmployeeDAO dao = new EmployeeDAO();

	public void write() {
		
		System.out.printf("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.printf("사번 입력 : ");
		String num = sc.nextLine();
		
		System.out.printf("주민번호 입력 : ");
		String ssn = sc.nextLine();
		
		Employee em = new Employee(name,num,ssn);
		
		dao.addNewEmployee(em);
		
		System.out.println("입력 완료.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeUI ui = new EmployeeUI();
		
		while (true) {
			System.out.println("신규 인사정보를 등록하시겠습니까? (Y/N)");
			String answer =sc.nextLine();
			if ( answer.equals("N") )
				break;	
			
			System.out.println("신규 인사정보를 등록합니다.");
			
			ui.write();
			
		}
		
		System.out.println("입력된 인사정보를 확인하시겠습니까? (Y/N) ");
		String answer = sc.nextLine();
		if (answer.equals("Y")) {
			for (int i=0; i < ui.dao.arr.size(); i++ ) {
				System.out.println((i+1)+ " 번쨰 사원의 인사기록  ");
				System.out.println("이름 : " + ui.dao.arr.elementAt(i).getName() );
				System.out.println("사원번호 : " + ui.dao.arr.elementAt(i).getNum() );
				System.out.println("주민번호 : " + ui.dao.arr.elementAt(i).getSsn() );
			}
		}
			
	}

}
