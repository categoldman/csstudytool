package com.categ.csstudytool.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private int projectSize;

    @JsonIgnore
    @OneToMany(mappedBy = "assignee",cascade=CascadeType.ALL)
    private List<Issue> assignedIssues = new ArrayList<>();
}
