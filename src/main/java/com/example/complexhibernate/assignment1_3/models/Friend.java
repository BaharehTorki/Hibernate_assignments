package com.example.complexhibernate.assignment1_3.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
    @GeneratedValue
    private Long id;
    private String namn;
    private String adress;
    private String mobilNr;

    public Friend(String namn, String adress, String mobilNr){
        this.namn = namn;
        this.adress = adress;
        this.mobilNr = mobilNr;
    }
}
