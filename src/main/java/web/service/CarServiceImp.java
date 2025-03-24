package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "White", "AE453GE"));
        cars.add(new Car("Audi", "Red", "AET768T"));
        cars.add(new Car("LADA", "Black", "K246HN73"));
        cars.add(new Car("Mercedes", "White", "OIHJBG3"));
        cars.add(new Car("BMW", "Blue", "A666UE77"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}