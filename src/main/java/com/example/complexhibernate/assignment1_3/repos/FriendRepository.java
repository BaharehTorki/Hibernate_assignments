package com.example.complexhibernate.assignment1_3.repos;

import com.example.complexhibernate.assignment1_3.models.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendRepository extends JpaRepository <Friend,Long> {
    public List<Friend> findByNamn(String namn);

}
