package dev.treeSetChallenge;

public class BookingAgent {
    public static void main(String[] args) {
        int rows = 10;
        int totalSeats = 100;
        Theatre lagosQuilox = new Theatre("Lagos Quilox",rows,totalSeats);
        lagosQuilox.printSeatMap();

        bookSeat(lagosQuilox,'A',3);
    }

    private static void bookSeat(Theatre theatre, char row, int seatNo){
        String seat = theatre.reserveSeat(row,seatNo);
        if(seat != null){
            System.out.println("Congrats your reserve seat is "+ seat);
            theatre.printSeatMap();
        }else {
            System.out.println("Sorry Unable to reserved the seat no requested");
        }
    }
}
