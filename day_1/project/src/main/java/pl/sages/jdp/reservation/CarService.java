package pl.sages.jdp.reservation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor(access = AccessLevel.PACKAGE)
class CarService {

    private final TripService tripService;

    CarService(@Lazy TripService tripService) {
        this.tripService = tripService;
    }
}
