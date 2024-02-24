package dev.treeSetChallenge;

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

        bookSeats(lagosQuilox,4,'B',3,10);
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
    private static void bookSeats (Theatre theatre, int tickets, char minRow,int minSeat, int maxSeat){
        bookSeats(theatre,tickets,minRow,minRow,minSeat,maxSeat);
    }
    private static void bookSeats (Theatre theatre, int tickets, char minRow, char maxRow,int minSeat, int maxSeat){
        var seats = theatre.reserveSeats(tickets,minRow,maxRow,minSeat,maxSeat);
        if(seats !=null){
            System.out.println("Congratulations! your reserved seats are "+ seats);
            theatre.printSeatMap();
        }else {
            System.out.println("Sorry! No matching contiguous seats in rows: "+minRow +" - "+maxRow);
        }
    }
}
