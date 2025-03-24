package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {

    CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("table", carService.getCars(count));
        return "cars";
    }
}