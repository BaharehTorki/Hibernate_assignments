package com.example.complexhibernate.assignment.controller;

import com.example.complexhibernate.assignment.models.Friend;
import com.example.complexhibernate.assignment.repos.FriendRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {

    private final FriendRepository repository;

      /*  public void test(){
            repository.save(new Friend(1L, "Name", "as","asldj"));

        }*/

    FriendController(FriendRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("friend")
    public List<Friend> getAllFriends() {
        return repository.findAll();
    }

    @PostMapping("friend/{id}")
    public Friend findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("friend/add")
    public List<Friend> addFriend(@RequestBody Friend f) {
        repository.save(f);
        return repository.findAll();
    }
}
