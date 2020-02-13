package com.cg.lab10.assignment5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EmployeeRepository
{
	ArrayList<Employee> listOfEmployee=new ArrayList<Employee>();
	
	public EmployeeRepository()
	{
		DateTimeFormatter myFormat =DateTimeFormatter.ofPattern("dd MM yyyy");

		listOfEmployee.add(new Employee(11603400, 1160, "Shubham","Rao","shubham.rtg@gmail.com","8360036501", "analyst", 30000.00,
				LocalDate.parse("04 01 1998", myFormat),new Department(123,1160,"Financial service")));
		listOfEmployee.add(new Employee(11603434, 1160, "madhu","patnam","madhu.rtg@gmail.com","8360035674", "analyst", 30000.00,
				LocalDate.parse("04 05 1997", myFormat),new Department(123,1160,"Financial service")));
		listOfEmployee.add(new Employee(11753457, 1175, "Shashwat","khare","shashwat.rtg@gmail.com","8360036501", "senior analyst", 70000.00,
				LocalDate.parse("23 11 1995", myFormat),new Department(133,1175,"Business development")));
		listOfEmployee.add(new Employee(11753432, 1175, "midget","kapoor","midget.rtg@gmail.com","8360035434", "senior analyst", 70000.00,
				LocalDate.parse("20 10 1995", myFormat),new Department(133,1175,"Business development")));
		listOfEmployee.add(new Employee(11750057, 1175, "nitish","kumar","nitish.rtg@gmail.com","8365326501", "senior analyst", 70000.00,
				LocalDate.parse("15 12 1996", myFormat),new Department(133,1175,"Business development")));
		
	}
}
