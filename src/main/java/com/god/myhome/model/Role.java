package com.god.myhome.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
public class Role {

    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
