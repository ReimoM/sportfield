package com.sports.sportfield.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private Integer id;
    private Integer roleId = 1;
    private String contactFirstName;
    private String contactLastName;
    private String contactTelephone;
    private String contactEmail;
    private String username;
    private String password;
}
