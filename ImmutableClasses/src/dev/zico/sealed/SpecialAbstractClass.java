package dev.zico.sealed;

public sealed abstract class SpecialAbstractClass permits FinalKid, NonSealedKid,
        SealedKid, SpecialAbstractClass.Kid {

    //if this nested class Kid is the only class dependent on SpecialAbstractClass, then you can ommit it from
    // the permit list, but if it's not the only class you cant
    final class Kid extends SpecialAbstractClass{
    //
    }
}
