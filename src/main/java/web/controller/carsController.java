package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.Service;
import service.ServicesImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class carsController {

    @RequestMapping(value = "cars", method = RequestMethod.GET)

    public String printCars(HttpServletRequest request, ModelMap model) {
        String locale = request.getParameter("locale");
        String title = null;
        List<Car> cars = new ServicesImpl().getListCars();
        List<String> messages = new ArrayList<>();
        for (Car car : cars
        ) {
            messages.add(car.toString());
        }

        model.addAttribute("messages", messages);
        if(locale.equals("ru")){
            title="Машины";
        } else {
            title="Cars";
        }
        model.addAttribute("title", title);
        return "cars";
    }
}
