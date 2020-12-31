package com.fincityltd;

import com.fincityltd.entity.Car;
import com.fincityltd.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OrmconfigApplication {

    @Autowired
    CarRepo carRepo;
    public static void main(String[] args) {
        SpringApplication.run(OrmconfigApplication.class, args);
    }

    @PostConstruct
    public void dataInitializer(){
        Car car1 = new Car("BMW","M5");
        Car car2 = new Car("Toyota","Corolla");
        Car car3 = new Car("Hyundai","Jazz");

        carRepo.save(car1);
        carRepo.save(car2);
        carRepo.save(car3);
    }
}
