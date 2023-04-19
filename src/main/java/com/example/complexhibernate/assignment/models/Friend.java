package com.example.complexhibernate.assignment.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@Data
@RestController
@Entity
public class Friend {
    @Id
    private int id;
    private String namn;
    private String adress;
    private String mobilNr;
}
