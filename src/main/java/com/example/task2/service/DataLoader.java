package com.example.task2.service;

import com.example.task2.domain.Employee;
import com.example.task2.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataLoader {

    private EmployeeRepository employeeRepository;
    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);


    @Autowired
    public DataLoader(EmployeeRepository employeeRepository){
        this.setEmployeeRepository(employeeRepository);
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostConstruct
    private void loadData(){
        Employee emp1 = new Employee("Jamima Begum", "1.01.2019", "In-House", "Operations", "France");
        employeeRepository.save(emp1);
        Employee emp2 = new Employee("Mercedes Banks", "1.02.2019", "Reference", "Accounting", "Argentina");
        employeeRepository.save(emp2);

        //Prints the current count of employees registered
        logger.info("Current employees registered count: " + employeeRepository.count());

        employeeRepository.deleteById(2L);

        //Prints the current count of employees registered
        logger.info("Current employees registered count: " + employeeRepository.count());

        //Adds a new employee
        Employee emp3 = new Employee("Macauley Peck", "1.06.2019", "Reference", "Marketing", "Italy");
        employeeRepository.save(emp3);

//        //Deletes all employees
//        employeeRepository.deleteAll();
//
//        //Prints the current count of employees registered
//        logger.info("Current employees registered count: " + String.valueOf(employeeRepository.count()));

    }

}
