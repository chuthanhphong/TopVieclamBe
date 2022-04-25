package com.TopViecLam.service.role;

import com.TopViecLam.model.Role;
import com.TopViecLam.service.IGeneralService;

import java.util.Optional;

public interface IRoleService extends IGeneralService<Role> {

    Optional<Role> findByName(String name);
}
