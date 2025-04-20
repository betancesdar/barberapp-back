package dev.dariobetances.barberapp_back.repository;

import dev.dariobetances.barberapp_back.model.Appoinment;
import dev.dariobetances.barberapp_back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppoimentRepository extends JpaRepository<Appoinment, Long> {
    List<Appoinment> findByBarber(User barber);
    List<Appoinment> findByCustomer(User customer);
}
