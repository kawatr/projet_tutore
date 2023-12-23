package com.tutorat.tutorat.services;

import com.tutorat.tutorat.dto.SignupRequest;

public interface AuthService {


	boolean createUtilisateur(SignupRequest signupRequest);

}
