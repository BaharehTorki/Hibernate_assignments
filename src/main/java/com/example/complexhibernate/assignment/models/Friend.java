package com.example.complexhibernate.assignment.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@RestController
@Entity
public class Friend {
    @Id
    @GeneratedValue
    private Long id;
    private String namn;
    private String adress;
    private String mobilNr;

    public Friend(String name, String adress, String mobilNr){
        this.namn = name;
        this.adress = adress;
        this.mobilNr = mobilNr;
    }
}
