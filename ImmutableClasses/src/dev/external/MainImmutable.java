package dev.external;

import dev.zico.PersonImmutable;

public class MainImmutable {

    public static void main(String[] args) {
        PersonImmutable jane = new PersonImmutable("Jane","01/01/1930");
        PersonImmutable jim = new PersonImmutable("Jim","02/02/1932");
        PersonImmutable joe = new PersonImmutable("Joe", "03/03/1934");
        PersonImmutable[] johnsKids = {jane,jim,joe};
        PersonImmutable john = new PersonImmutable("John","05/05/1900",johnsKids);
        System.out.println(john);

        PersonImmutable[] kids = john.getKids();
        kids[0] = jim;
        kids[1] = new PersonImmutable("Ann","03/12/2015");
        System.out.println(john);

        johnsKids[0] = new PersonImmutable("Ann","12/01/1919");
        System.out.println(john);

    }
}
