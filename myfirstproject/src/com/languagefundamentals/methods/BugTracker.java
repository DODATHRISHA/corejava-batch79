
package com.languagefundamentals.methods;

public class BugTracker {

    int bugid;
    String applicationName;
    String bugTitle;
    String severity;
    String priority;
    String status;
    String assignedDeveloper;

    // Getters
    int getBugId() {
        return bugid;
    }

    String getApplicationName() {
        return applicationName;
    }

    String getBugTitle() {
        return bugTitle;
    }

    String getSeverity() {
        return severity;
    }

    String getPriority() {
        return priority;
    }

    String getStatus() {
        return status;
    }

    String getAssignedDeveloper() {
        return assignedDeveloper;
    }

    // Assign developer
    void assignToDeveloper(int bugId, String developerName) {
        assignedDeveloper = developerName;
        status = "In Development";
    }

    // Update status
    void updateStatus(String newStatus) {
        status = newStatus;
    }

    // Display bug summary
    void displayBugSummary() {
        System.out.println("Bug ID: " + bugid);
        System.out.println("Application Name: " + applicationName);
        System.out.println("Bug Title: " + bugTitle);
        System.out.println("Severity: " + severity);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
        System.out.println("Assigned Developer: " + assignedDeveloper);
    }

    public static void main(String[] args) {

        BugTracker b = new BugTracker();

        // Initialize values using object reference
        b.bugid = 101;
        b.applicationName = "Online Shopping App";
        b.bugTitle = "Login button not working";
        b.severity = "High";
        b.priority = "P1";
        b.status = "Open";
        b.assignedDeveloper = "Not Assigned";

        // Assign developer
        b.assignToDeveloper(101, "Divya");

        // Update status
        b.updateStatus("Closed");

        // Display bug details
        b.displayBugSummary();  
}
}


