package dev.challenge;

enum Priority{HIGH,MEDIUM,LOW}
enum Status{IN_QUEUE,ASSIGNED,IN_PROGRESS}

public class Task {

    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    public Task(String project, String description, String assignee, Priority priority, Status status) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public Task(String description, String assignee, Priority priority) {
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
    }
}
