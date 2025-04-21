package dev.dariobetances.barberapp_back.service;

import dev.dariobetances.barberapp_back.config.JwtService;
import dev.dariobetances.barberapp_back.dto.AuthResponse;
import dev.dariobetances.barberapp_back.dto.LoginRequest;
import dev.dariobetances.barberapp_back.dto.RegisterRequest;
import dev.dariobetances.barberapp_back.model.Role;
import dev.dariobetances.barberapp_back.model.User;
import dev.dariobetances.barberapp_back.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthResponse register(RegisterRequest request) {
        User user = new User();
        user.setName(request.getFirstName());
        user.setSurname(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.CUSTOMER);

        userRepository.save(user);

        String token = jwtService.generateToken(user);
        return new AuthResponse(token);
    }
}
