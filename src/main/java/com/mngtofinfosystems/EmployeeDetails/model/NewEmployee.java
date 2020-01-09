package com.mngtofinfosystems.EmployeeDetails.model;

import java.util.List;

public class NewEmployee {

    private List<EmployeeDetails> employeeDetails;

    public List<EmployeeDetails> getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public String toString() {
        return "NewEmployee{" +
                "employeeDetails=" + employeeDetails +
                '}';
    }
}
