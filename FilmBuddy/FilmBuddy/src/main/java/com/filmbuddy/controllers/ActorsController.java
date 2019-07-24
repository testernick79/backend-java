package com.filmbuddy.controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.filmbuddy.models.Actor;

@Controller
@RequestMapping({ "/", "/actors" })
public class ActorsController {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

     @GetMapping()
        public String getAllActors(Model model) {
            List<Actor> Actors = new ArrayList<>();

            // Code to query the database and
            // add actors to the List will go here
            Connection con;
            try {
                con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT actor.first_name,actor.last_name,film.title FROM film JOIN film_actor USING (film_id) JOIN actor USING (actor_id) ");
                while (rs.next()) {
                    // create a new Actor object
                    Actor Actor = new Actor();
                    // get the values from each column of the current row and add them to the new Album
                    Actor.setActor(rs.getString("first_name") + " " + rs.getString("last_name"));
                    Actor.setFilm(rs.getString("title"));


                    // add the new actor to the actors list
                    Actors.add(Actor);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            

            model.addAttribute("Actors", Actors);
            return "Actors";
        }
}