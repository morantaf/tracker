package com.fitness.tracker.service;

import com.fitness.tracker.domain.User;
import com.fitness.tracker.dto.AuthenticationRequest;
import org.springframework.http.ResponseEntity;

public interface SecurityService {

    ResponseEntity<String> authenticate(AuthenticationRequest request);

    User getCurrentUser();
}
