package dev.dariobetances.barberapp_back.repository;

import dev.dariobetances.barberapp_back.model.Service;
import dev.dariobetances.barberapp_back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByBarber(User barber);
}
