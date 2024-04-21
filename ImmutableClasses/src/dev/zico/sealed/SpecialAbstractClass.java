package dev.zico.sealed;

public sealed abstract class SpecialAbstractClass permits SpecialAbstractClass.Kid{

    final class Kid extends SpecialAbstractClass{

    }
}
