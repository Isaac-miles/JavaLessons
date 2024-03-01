package dev.zico;

import java.util.Arrays;

public class PersonImmutable {

    private final String name;
    private final String dob;
    private final PersonImmutable[] kids;

    public PersonImmutable(String name, String dob, PersonImmutable[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids==null ? null:Arrays.copyOf(kids,kids.length);
    }

    public PersonImmutable(String name, String dob) {
        this(name,dob,null);
    }
    protected PersonImmutable(PersonImmutable person){
        this.name = person.name;
        this.dob = person.dob;
        this.kids = person.kids;
    }

    public String getName() {
        return name;
    }


    public String getDob() {
        return dob;
    }

    public PersonImmutable[] getKids() {
        return kids == null? null:Arrays.copyOf(kids,kids.length);
    }

    @Override
    public String toString() {
        String kidstring = "n/a";
        if(kids !=null){
            String[] names = new String[kids.length];
            Arrays.setAll(names,i->names[i]=kids[i]==null ? "":kids[i].name);
            kidstring = String.join(", ", Arrays.toString(names));
        }
        return name+", dob =  "+ dob+ ", kids = "+ kidstring;
    }
}
