package dev.treeSetChallenge;

import java.util.Set;

public class BookingAgent {
    public static void main(String[] args) {
        int rows = 10;
        int totalSeats = 100;
        Theatre lagosQuilox = new Theatre("Lagos Quilox",rows,totalSeats);
//        lagosQuilox.printSeatMap();

        bookSeat(lagosQuilox,'A',3);
        bookSeat(lagosQuilox,'A',3);

        bookSeat(lagosQuilox,'C',2);
        bookSeat(lagosQuilox,'C',11);
        bookSeat(lagosQuilox,'M',3);
    }

    private static void bookSeat(Theatre theatre, char row, int seatNo){
        String seat = theatre.reserveSeat(row,seatNo);
        if(seat != null){
            System.out.println("Congrats your reserve seat is "+ seat);
            theatre.printSeatMap();
        }else {
            System.out.println("Sorry Unable to reserve "+row+seatNo);
        }
    }

}
