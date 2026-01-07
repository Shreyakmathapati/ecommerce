package com.Jsp.ecommerce.service;

import java.util.Map;

import com.Jsp.ecommerce.dto.LoginDto;

public interface AuthService {

	Map<String, Object> login(LoginDto loginDto);

}
