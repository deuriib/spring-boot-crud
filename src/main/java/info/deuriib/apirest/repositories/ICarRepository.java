package info.deuriib.apirest.repositories;

import info.deuriib.apirest.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(String brand);

    List<Car> findByModel(String model);

    List<Car> findByColor(String color);

    List<Car> findByYear(String year);
}
