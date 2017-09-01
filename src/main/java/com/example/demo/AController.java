package com.example.demo;

import com.example.demo.dao.TeamDAO;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
// or @RestController whcih makes @ResponseBody redundant
public class AController {

    @Autowired
    TeamDAO teamDAO;


/*
Once the domain object (Team) has @XmlRootElement then we can automagically get JSON or XML by
using .json or .xml ie

http://127.0.0.1:8080/hi.json
http://127.0.0.1:8080/hi.xml
OR
the client can use header
Accept application/xml
Accept appication/json
 */
    @RequestMapping("/hi/{name}")
    public  @ResponseBody Team byName(@PathVariable String name){

        return teamDAO.findByName(name);
    }
    @RequestMapping("/locations/{location}")
    public  @ResponseBody Team byLocation(@PathVariable String location){

        return teamDAO.findByLocation(location);
    }
}
