package com.powernode.pojo;

import lombok.Data;

@Data
public class Student {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String address;
    private String sex;
}
