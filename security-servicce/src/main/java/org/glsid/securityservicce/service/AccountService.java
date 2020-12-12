package org.glsid.securityservicce.service;

import org.glsid.securityservicce.entities.AppRole;
import org.glsid.securityservicce.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}

