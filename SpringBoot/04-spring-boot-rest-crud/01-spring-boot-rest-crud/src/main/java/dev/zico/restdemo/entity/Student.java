package dev.zico.restdemo.entity;

public class Student {

        private String FirstName;
        private String LastName;

        public Student() {}

        public Student(String FirstName, String LastName) {
            this.FirstName = FirstName;
            this.LastName = LastName;
        }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
