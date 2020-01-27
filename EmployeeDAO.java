package practice;

import java.util.*;

public class EmployeeDAO {
	Vector<Employee> arr = new Vector<Employee>(10);
	private int index = 0;
	
	public boolean addNewEmployee(Employee newEMP) {
		boolean result = false;
		if (index > arr.size()) 
			return false;
		
		arr.add(index,newEMP);
		
		index ++;
		result =true;
		System.out.println("디버그 : DAO의 처리 결과 " + result);
		return result;
	}
}
