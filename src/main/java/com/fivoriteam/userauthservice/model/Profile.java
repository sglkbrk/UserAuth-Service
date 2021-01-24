package com.fivoriteam.userauthservice.model;

import lombok.*;
import java.util.Date;
import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    private String displayName;
    private String profilePictureUrl;
    private Date birthday;
    private Set<Address> addresses;
}
