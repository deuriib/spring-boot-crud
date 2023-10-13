package info.deuriib.apirest.services;

import info.deuriib.apirest.models.Car;
import info.deuriib.apirest.repositories.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final ICarRepository _autoRepository;

    @Autowired
    public CarService(ICarRepository autoRepository) {
        _autoRepository = autoRepository;
    }

    public void create(Car car) {
        _autoRepository.save(car);
    }

    public List<Car> getAll() {
        return _autoRepository.findAll();
    }

    public Optional<Car> getById(Long id) {
        return _autoRepository.findById(id);
    }

    public void update(Car car) {
        _autoRepository.save(car);
    }

    public void delete(Long id) {
        _autoRepository.deleteById(id);
    }

    public List<Car> findByBrand(String marca) {
        return _autoRepository.findByBrand(marca);
    }

    public List<Car> findByModel(String modelo) {
        return _autoRepository.findByModel(modelo);
    }

    public List<Car> findByColor(String color) {
        return _autoRepository.findByColor(color);
    }

    public List<Car> findByYear(String anio) {
        return _autoRepository.findByYear(anio);
    }
}
