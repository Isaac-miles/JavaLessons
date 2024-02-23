package dev.treeSetChallenge;

import java.util.NavigableSet;

public class Theatre {
    class Seat implements Comparable<Seat>{
        private String seatNum;
        private boolean reserved;

        public Seat(char rowChar,int seatNo) {
            this.seatNum = "%C%03d".formatted(rowChar,seatNo);
        }

        @Override
        public String toString() {
            return seatNum;
        }

        @Override
        public int compareTo(Seat o) {
           return seatNum.compareTo(o.seatNum);
        }
    }
    private String theatreName;
    private int seatsPerRow;
    private NavigableSet<Seat> seats;

    public Theatre(String theatreName, int rows,int totalSeats) {
        this.theatreName = theatreName;
        this.seatsPerRow = totalSeats/rows;
    }
}
