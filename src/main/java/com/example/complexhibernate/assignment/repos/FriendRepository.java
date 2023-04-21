package com.example.complexhibernate.assignment.repos;

import com.example.complexhibernate.assignment.models.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository <Friend,Long> {
    public Friend findByName(String namn);

}
