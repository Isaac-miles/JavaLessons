package dev.challenge;

enum Priority{HIGH,MEDIUM,LOW}
enum Status{IN_QUEUE,ASSIGNED,IN_PROGRESS}

public class Task {

    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

}
