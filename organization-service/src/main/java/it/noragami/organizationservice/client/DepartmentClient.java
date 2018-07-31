package it.noragami.organizationservice.client;

import it.noragami.organizationservice.model.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "department-service")
public interface DepartmentClient {

    @GetMapping("/organization/{organizationId}")
    List<Department> findByOrganization(@PathVariable("organizationId") Long organizationId);

    @GetMapping("/organization/{organizationId}/with-employees")
    List<Department> findByOrganizationWithEmployees(@PathVariable("organizationId") Long organizationId);

}