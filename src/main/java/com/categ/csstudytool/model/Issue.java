package com.categ.csstudytool.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data

public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User assignee;

}
