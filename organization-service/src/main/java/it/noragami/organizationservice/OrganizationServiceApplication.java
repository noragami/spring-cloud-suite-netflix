package it.noragami.organizationservice;

import it.noragami.organizationservice.model.Organization;
import it.noragami.organizationservice.repository.OrganizationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}


	@Bean
	OrganizationRepository repository() {
		OrganizationRepository repository = new OrganizationRepository();
		repository.add(new Organization("Microsoft", "Redmond, Washington, USA"));
		repository.add(new Organization("Oracle", "Redwood City, California, USA"));
		return repository;
	}
}
