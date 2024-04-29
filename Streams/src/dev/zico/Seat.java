package dev.zico;

public record Seat(char rowMarker,int seatNumber,double price) {
    public Seat(char rowMarker, int seatNumber) {
        this(rowMarker, seatNumber, 0);
    }
}
