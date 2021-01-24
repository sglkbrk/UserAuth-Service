package com.fivoriteam.userauthservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    public final static Role USER = new Role("USER");
    public final static Role FACEBOOK_USER = new Role("FACEBOOK_USER");

    private String name;
}

