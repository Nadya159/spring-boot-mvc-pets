package com.nadya159.springbootmvcpets.model;

import com.nadya159.springbootmvcpets.dto.PetDto;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private List<PetDto> pets;
}
