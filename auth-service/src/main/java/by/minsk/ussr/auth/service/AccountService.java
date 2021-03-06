package by.minsk.ussr.auth.service;

import by.minsk.ussr.auth.model.User;

import java.util.Optional;

public interface AccountService {
    Optional<User> findByUsername(String username);
    Optional<User> findOneByEmail(String email);
    Optional<User> findByActivationKey(String activationKey);

    void save(User user);

    void activateRegistration(User user);
}
