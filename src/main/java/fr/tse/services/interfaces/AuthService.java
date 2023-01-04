package fr.tse.services.interfaces;

import fr.tse.payload.request.LoginRequest;
import fr.tse.payload.request.SignupRequest;
import fr.tse.payload.response.JwtResponse;
import fr.tse.payload.response.MessageResponse;

public interface AuthService {

    public JwtResponse authenticateUser(LoginRequest loginRequest);

    public MessageResponse registerUser(SignupRequest signUpRequest);
}
