package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServicesImpl implements Service {
    @Override
    public List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", "type1", 100));
        cars.add(new Car("model2", "type2", 200));
        cars.add(new Car("model3", "type3", 300));
        return cars;
    }
}
