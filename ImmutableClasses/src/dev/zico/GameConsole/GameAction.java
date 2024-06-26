package dev.zico.GameConsole;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {

}
