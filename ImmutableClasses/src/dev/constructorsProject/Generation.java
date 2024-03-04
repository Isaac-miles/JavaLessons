package dev.constructorsProject;

public enum Generation {
    GEN_Z,
    MILLENNIAL,
    GEN_X,
    BABY_BOOMER,
    SILENT_GENERATION,
    GREATEST_GENERATION;

    Generation() {
        System.out.println(this);
    }
}
