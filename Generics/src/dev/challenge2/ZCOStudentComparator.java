package dev.challenge2;

import java.util.Comparator;

public class ZCOStudentComparator implements Comparator<ZCOStudent> {
    @Override
    public int compare(ZCOStudent o1, ZCOStudent o2) {
        return (int)(o1.getPercentComplete() - o2.getPercentComplete());
    }
}
