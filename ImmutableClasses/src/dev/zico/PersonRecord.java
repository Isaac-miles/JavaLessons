package dev.zico;

import java.util.Arrays;

public record PersonRecord(String name, String dob, PersonRecord[] kids) {
    public PersonRecord(String name, String dob) {
        this(name, dob, new PersonRecord[20]);


    }
    @Override
    public String toString() {
        String kidstring = "n/a";
        if(kids !=null){
            String[] names = new String[kids.length];
            Arrays.setAll(names, i->names[i]=kids[i]==null ? "":kids[i].name);
            kidstring = String.join(", ", Arrays.toString(names));
        }
        return name+", dob =  "+ dob+ ", kids = "+ kidstring;
    }

    @Override
    public PersonRecord[] kids() {
        return kids == null ? null:Arrays.copyOf(kids,kids.length);
    }
}
