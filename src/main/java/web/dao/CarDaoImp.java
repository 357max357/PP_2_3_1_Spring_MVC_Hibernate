package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final int maxCountCars = 5;
    private final int startIndex = 0;
    private List<Car> cars;

    @Override
    public List<Car> GetNumberCars(Integer count) {
        cars = new ArrayList<>();

        cars.add(new Car("model1", 1, 2001));
        cars.add(new Car("model2", 2, 2002));
        cars.add(new Car("model3", 3, 2003));
        cars.add(new Car("model4", 4, 2004));
        cars.add(new Car("model5", 5, 2005));

        return count >= maxCountCars ? cars :
                new ArrayList<>(cars.subList(startIndex, count));
    }
}
