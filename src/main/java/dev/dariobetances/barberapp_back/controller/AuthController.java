package dev.dariobetances.barberapp_back.controller;

import dev.dariobetances.barberapp_back.dto.AuthResponse;
import dev.dariobetances.barberapp_back.dto.LoginRequest;
import dev.dariobetances.barberapp_back.dto.RegisterRequest;
import dev.dariobetances.barberapp_back.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

}
