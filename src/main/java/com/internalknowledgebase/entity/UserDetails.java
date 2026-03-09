package com.internalknowledgebase.entity;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class UserDetails extends User {

    @Getter
    private final MtUser mtUser;

    public UserDetails(MtUser mtUser,
                       Collection<GrantedAuthority> authorities) {

        super(mtUser.getUsername(), mtUser.getPassword(),
                true, true, true, true, authorities);

        this.mtUser = mtUser;
    }
}