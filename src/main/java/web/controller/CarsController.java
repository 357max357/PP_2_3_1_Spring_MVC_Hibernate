package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
class CarsController {

    private CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String createCars(@RequestParam(value = "count", defaultValue = "5") Integer count,
                             ModelMap model) {

        model.addAttribute("message", carService.GetNumberCars(count));

        return "cars";
    }
}
