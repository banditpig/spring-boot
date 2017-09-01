package com.example.demo.dao;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players", rel="players")
public interface PlayerDAO extends CrudRepository<Player,Long> { //the type and the id
}
