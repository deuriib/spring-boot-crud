package info.deuriib.apirest.controllers;

import info.deuriib.apirest.models.Car;
import info.deuriib.apirest.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarRestController {
    private final CarService _carService;

    @Autowired
    public CarRestController(CarService carService) {
        _carService = carService;
    }

    @PostMapping(value = "", headers = "Accept=application/json")
    public void create(@RequestBody Car car) {
        _carService.create(car);
    }

    @GetMapping(value = "", headers = "Accept=application/json")
    public List<Car> getAll() {
        return _carService.getAll();
    }

    @GetMapping(value = "{id}", headers = "Accept=application/json")
    public Optional<Car> getById(@PathVariable Long id) {
        return _carService.getById(id);
    }

    @PutMapping(value = "", headers = "Accept=application/json")
    public void update(@RequestBody Car car) {
        _carService.update(car);
    }

    @DeleteMapping(value = "{id}", headers = "Accept=application/json")
    public void delete(@PathVariable Long id) {
        _carService.delete(id);
    }

    @GetMapping(value = "/brand/{brand}", headers = "Accept=application/json")
    public List<Car> findByBrand(@PathVariable String brand) {
        return _carService.findByBrand(brand);
    }

    @GetMapping(value = "/model/{model}", headers = "Accept=application/json")
    public List<Car> findByModel(@PathVariable String model) {
        return _carService.findByModel(model);
    }

    @GetMapping(value = "/color/{color}", headers = "Accept=application/json")
    public List<Car> findByColor(@PathVariable String color) {
        return _carService.findByColor(color);
    }

    @GetMapping(value = "/year/{year}", headers = "Accept=application/json")
    public List<Car> findByYear(@PathVariable String year) {
        return _carService.findByYear(year);
    }
}
