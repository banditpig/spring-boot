package com.example.demo;

import com.example.demo.dao.TeamDAO;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {
    @Autowired
	TeamDAO teamDAO;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("fred12", "batter"));
		players.add(new Player("joe", "thrower"));
		Team team = new Team("Snoopy", "Havant", players);
		teamDAO.save(team);

		players.clear();
		players.add(new Player("etim","thrower"));
		players.add(new Player("mike","catcher"));
		team = new Team("bad 11","north", players);
		teamDAO.save(team);

	}
}
