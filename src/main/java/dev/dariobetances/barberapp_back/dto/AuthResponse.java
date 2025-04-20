package dev.dariobetances.barberapp_back.dto;


import lombok.*;

@Data
@Builder
@AllArgsConstructor

public class AuthResponse {
    private String token;
}
