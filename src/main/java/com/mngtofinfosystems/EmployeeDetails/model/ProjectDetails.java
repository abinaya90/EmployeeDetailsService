package com.mngtofinfosystems.EmployeeDetails.model;

import java.time.LocalDate;

public class ProjectDetails {

    private int projectId;
    private String projectName;
    private LocalDate startDate;
    private LocalDate plannedEndDate;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(LocalDate plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    @Override
    public String toString() {
        return "ProjectDetails{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", plannedEndDate=" + plannedEndDate +
                '}';
    }
}
