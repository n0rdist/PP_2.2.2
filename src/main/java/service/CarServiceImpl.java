package service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(2006, "Nissan", "Murano"));
        cars.add(new Car(2015, "Nissan", "X-trail"));
        cars.add(new Car(2014, "Volvo", "XC90"));
        cars.add(new Car(2018, "Lada", "Granta"));
        cars.add(new Car(2020, "Honda", "Element"));
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
