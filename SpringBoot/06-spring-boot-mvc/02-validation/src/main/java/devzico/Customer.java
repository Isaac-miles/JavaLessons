package devzico;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    private  String firstName;
    @NotNull(message = "field is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 0,message = "must be greater than 0")
    @Max(value = 10,message = "must be less than 10")
    private int freePass;

    public int getFreePass() {
        return freePass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
