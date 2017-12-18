package com.example.test.testapp;

import com.example.test.testapp.objects.Actor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by c-kasgus on 2017-12-14.
 */

public class MyBackend {
    public static List<Actor> actors = createAllActors();
    public static Map<String, Actor> actorMap = createActorMap(actors);

    public List<Actor> getActors() {

        return null;
    }

    public Actor createActor() {
        return null;
    }

    private List<Actor> getAllActors() {
        return actors;
    }

    private static List<Actor> createAllActors () {
        Actor brad = new Actor("brad_pitt",
                "Brad Pitt",
                "An actor and producer known as much for his versatility as he is for his handsome face, Golden Globe-winner Brad Pitt's most widely recognized role may be Tyler Durden in Fight Club (1999).",
                Arrays.asList("Fight Club", "Snatch"));
        Actor alicia = new Actor("alicia_vikander",
                "Alicia Vikander",
                "Alicia Vikander is a Swedish actress, dancer and producer. She was born and raised in Gothenburg, Västra Götalands län, Sweden, to Maria Fahl-Vikander, an actress of stage and screen, and Svante Vikander, a psychiatrist. She is of Swedish and one quarter Finnish descent.",
                Arrays.asList("Ex Machina", "The Danish Girl"));

        return Arrays.asList(brad, alicia);
    }

    private static Map<String, Actor> createActorMap (List<Actor> actors) {
        Map<String, Actor> actorMap = new HashMap<String, Actor>();
        for(Actor actor : actors) {
            actorMap.put(actor.getId(), actor);
        }
        return actorMap;
    }

}
