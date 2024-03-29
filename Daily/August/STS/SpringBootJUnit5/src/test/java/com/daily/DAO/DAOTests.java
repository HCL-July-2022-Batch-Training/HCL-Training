/*August 15, 2022*/

package com.daily.DAO;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.daily.DAO.EmployeeRepository;
import com.daily.Model.Employee;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DAOTests
{
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void testCreateReadDelete()
	{
		Employee employee = new Employee("Dylan", "lastname");

		employeeRepository.save(employee);

		Iterable<Employee> employees = employeeRepository.findAll();
		Assertions.assertThat(employees).extracting(Employee::getFirstName).containsOnly("Dylan");

//		employeeRepository.deleteAll();
//		Assertions.assertThat(employeeRepository.findAll()).isEmpty();
	}
}