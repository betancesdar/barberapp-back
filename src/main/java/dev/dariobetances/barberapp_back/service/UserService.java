package dev.dariobetances.barberapp_back.service;

import dev.dariobetances.barberapp_back.model.User;
import dev.dariobetances.barberapp_back.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository userRepository;

    //
    public List<User> findAll() {
        return userRepository.findAll();
    }



}
