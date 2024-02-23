package dev.treeSetChallenge;

public class Theatre {
    class Seat{
        private String seatNum;
        private boolean reserved;

        public Seat(char rowChar,int seatNo) {
            this.seatNum = "%C%03d".formatted(rowChar,seatNo);
        }
    }
}
