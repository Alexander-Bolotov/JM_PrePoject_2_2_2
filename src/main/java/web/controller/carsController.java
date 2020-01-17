package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.Service;
import service.ServicesImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class carsController {

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCars(ModelMap model) {

        List<Car> cars = new ServicesImpl().getListCars();
        List<String> messages = new ArrayList<>();
        for (Car car : cars
        ) {
            messages.add(car.toString());
        }
        model.addAttribute("messages", messages);
        return "cars";
    }
}
