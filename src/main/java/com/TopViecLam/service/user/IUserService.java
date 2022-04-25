package com.TopViecLam.service.user;


import com.TopViecLam.model.User;
import com.TopViecLam.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
}
