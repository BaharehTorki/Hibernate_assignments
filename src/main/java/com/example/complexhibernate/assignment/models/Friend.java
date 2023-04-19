package com.example.complexhibernate.assignment.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    private Long id;
    private String namn;
    private String adress;
    private String mobilNr;
}
