package com.mngtofinfosystems.EmployeeDetails.controller;

import com.mngtofinfosystems.EmployeeDetails.model.EmployeeDetails;
import com.mngtofinfosystems.EmployeeDetails.model.NewEmployee;
import com.mngtofinfosystems.EmployeeDetails.model.ProjectDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/newEmployee")
public class EmployeeDetailsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDetailsController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/joined")
    public NewEmployee getNewEmployeeJoining(){

        LOGGER.debug("Inside the getNewEmployeeJoining Method started");

        NewEmployee newEmployee = restTemplate.getForObject("http://employee-info-service/newEmployee", NewEmployee.class);

        for (EmployeeDetails employee: newEmployee.getEmployeeDetails()) {
            if(employee != null){
                employee.setProjectDetails(restTemplate.getForObject("http://project-info-service/project?empId=" + employee.getId(), ProjectDetails.class));
            }
        }
        LOGGER.debug("Inside the getNewEmployeeJoining Method ended");
        return newEmployee;
    }
}


/*
return newEmployee.getEmployeeDetails().stream()
        .map(employee -> {
        ProjectDetails projectDetail = restTemplate.getForObject("http://localhost:8086/project?empId=" + employee.getId(), ProjectDetails.class);
        return new NewEmployeeDetails(projectDetail);
        })
        .collect(Collectors.toList());*/
