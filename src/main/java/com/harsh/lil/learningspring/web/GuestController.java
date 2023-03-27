package com.harsh.lil.learningspring.web;


import com.harsh.lil.learningspring.bussiness.ReservationService;
import com.harsh.lil.learningspring.bussiness.RoomReservation;
import com.harsh.lil.learningspring.data.Guest;
import com.harsh.lil.learningspring.data.GuestRepository;
import com.harsh.lil.learningspring.data.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/guests")
public class GuestController {

    private final ReservationService reservationService;

    public GuestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getGuests(Model model){
        model.addAttribute("guests", this.reservationService.getHotelGuests());
                return "hotel-guests";
    }
}
