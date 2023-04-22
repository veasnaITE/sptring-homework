package com.istad.minispring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private int id;
    private String name;
    private String username;
    private String gender;
    private String email;
    private String bio;
    private String pfUrl;
    private String cvUrl;
}
