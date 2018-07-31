package it.noragami.departmentservice.client;


import it.noragami.departmentservice.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee-service")
public interface EmployeeClient {

    @GetMapping("/department/{departmentId}")
    List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);

}