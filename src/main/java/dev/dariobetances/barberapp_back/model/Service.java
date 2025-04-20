package dev.dariobetances.barberapp_back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Services")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer durationMinutes;

    @ManyToOne
    @JoinColumn(name= "barber_id")
    private User barber;

}
