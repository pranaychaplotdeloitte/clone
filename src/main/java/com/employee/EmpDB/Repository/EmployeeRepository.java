package com.employee.EmpDB.Repository;

import com.employee.EmpDB.Entity.EmployeeEntity;
import com.employee.EmpDB.Service.EmployeeServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//CRUD operations
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {

}
