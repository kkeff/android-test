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

    private static List<Actor> createAllActors () {
        Actor brad = new Actor("brad_pitt",
                "Brad Pitt",
                "An actor and producer known as much for his versatility as he is for his handsome face, Golden Globe-winner Brad Pitt's most widely recognized role may be Tyler Durden in Fight Club (1999).",
                Arrays.asList("Fight Club", "Snatch"));
        Actor alicia = new Actor("alicia_vikander",
                "Alicia Vikander",
                "Alicia Vikander is a Swedish actress, dancer and producer. She was born and raised in Gothenburg, Västra Götalands län, Sweden, to Maria Fahl-Vikander, an actress of stage and screen, and Svante Vikander, a psychiatrist. She is of Swedish and one quarter Finnish descent.",
                Arrays.asList("Ex Machina", "The Danish Girl"));
        Actor gal = new Actor("gal_gadot",
                "Gal Gadot",
                "Gal Gadot is an Israeli actress, singer, martial artist, and model. She was born in Rosh Ha'ayin, Israel, to an Ashkenazi Jewish family. Her parents are Irit, a teacher, and Michael, an engineer, who is a sixth-generation Israeli. She served in the IDF for two years, and won the Miss Israel title in 2004.\n" +
                        "\n" +
                        "Gal began modeling in the late 2000s, and made her film debut in the fourth film of the Fast and Furious franchise, Fast & Furious (2009), as Gisele. Her role was expanded in the sequels Fast & Furious 5 (2011) and Fast & Furious 6 (2013), in which her character was romantically linked to Han Seoul-Oh (Sung Kang). In the films, Gal performed her own stunts. She also appeared in the 2010 films En galen natt (2010) and Knight and Day (2010).",
                Arrays.asList("Wonder Woman", "Justice League", "Fast & Furious 7"));
        Actor brian = new Actor("brian_cox",
                "Brian Cox",
                "Brian Cox is an Emmy Award-winning Scottish actor. He was born on June 1, 1946 in Dundee, Scotland, to Mary Ann Guillerline Cox, maiden surname McCann, a spinner, and Charles McArdle Campbell Cox, a shopkeeper and butcher. His father was of Irish ancestry and his mother was of Irish and Scottish descent.",
                Arrays.asList("X-Men 2", "Troy"));
        Actor katie = new Actor("katie_holmes",
                "Katie Holmes",
                "Born two months premature at four pounds, Kate Noelle Holmes made her first appearance on December 18, 1978, in Toledo, Ohio. She is the daughter of Kathleen Ann (Craft), a philanthropist, and Martin Joseph Holmes, Sr., a lawyer. She is of German, Irish, and English ancestry. Her parents have said that her strong-willed personality is probably from being born premature. Being the youngest in the Holmes clan, completing the family of three other sisters and one brother, Katie was always the baby.",
                Arrays.asList("Batman Begins", "Jack and Jill"));
        return Arrays.asList(brad, alicia, gal, brian, katie);
    }

    private static Map<String, Actor> createActorMap (List<Actor> actors) {
        Map<String, Actor> actorMap = new HashMap<String, Actor>();
        for(Actor actor : actors) {
            actorMap.put(actor.getId(), actor);
        }
        return actorMap;
    }

}
