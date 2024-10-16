package com.registeruser.dtos.service;

import com.registeruser.dtos.requests.RegisterUserRequests;
import com.registeruser.dtos.response.RegisterUserResponses;
import org.springframework.stereotype.Service;

public interface UserService {
    RegisterUserResponses registerUser(RegisterUserRequests requests);
}
