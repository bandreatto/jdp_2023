package pl.sages.jdp.reservation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor(access = AccessLevel.PACKAGE)
class TripService {

//    @Lazy
    private final CarService carService;

    TripService(@Lazy CarService carService) {
        this.carService = carService;
    }
}
