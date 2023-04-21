package com.example.complexhibernate.assignment.controller;

import com.example.complexhibernate.assignment.models.Friend;
import com.example.complexhibernate.assignment.repos.FriendRepository;
import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {

    private final FriendRepository repository;
    private static final Logger log = LoggerFactory.getLogger(FriendController.class);
      /*  public void test(){
            repository.save(new Friend(1L, "Name", "as","asldj"));

        }*/

    FriendController(FriendRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("friend")
    public List<Friend> getAllFriends() {
        log.info("All friends returned ");
        return repository.findAll();
    }
    @PostMapping("friend/add")
    public List<Friend> addFriend(@RequestBody Friend f) {
        repository.save(f);
        return repository.findAll();
    }

    @RequestMapping("friend/{id}")
    public Friend findById(@PathVariable Long id) {
        log.info("Friend found with id " + id);
        return repository.findById(id).get();
    }

    @RequestMapping("friend/{name}/namn")
    public List <Friend> findById(@PathVariable String name) {
        return repository.findByName(name);
    }

    @RequestMapping("friend/{id}/delete")
    public List<Friend> deleteById(@PathVariable Long id) {
        repository.deleteById(id);
        log.info("Friend deleted with id " + id);
        return repository.findAll();
    }

}
