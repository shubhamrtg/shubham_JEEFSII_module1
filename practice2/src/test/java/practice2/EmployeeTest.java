package practice2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest 
{
	Employee obj1=new Employee(123,"shubham",15000,5);
	Employee obj2=new Employee(123,"shubham",15000.0,8.5);
	double expected=(15000-(15000*(8.5/100)));
	@Test
	void test()
	{
		
		assertEquals(15000,obj1.calNetPay());
		
	}
	
	@Test
	void test1()
	{
		assertEquals(expected,obj2.calNetPay());
	}

}
