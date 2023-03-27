package com.harsh.lil.learningspring.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "RESERVATION_ID")
    private long reservation_id;
    @Column(name = "ROOM_ID")
    private long room_id;
    @Column(name = "GUEST_ID")
    private long guest_id;
    @Column(name = "RES_DATE")
    private Date reservationDate;;


    public long getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(long reservation_id) {
        this.reservation_id = reservation_id;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public long getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservation_id +
                ", room_id=" + room_id +
                ", guest_id=" + guest_id +
                ", res_date=" + reservationDate +
                '}';
    }
}
