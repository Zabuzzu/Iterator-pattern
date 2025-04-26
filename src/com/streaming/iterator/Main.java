package com.streaming.iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Season s1 = new Season();
        s1.addEpisode(new Episode("Pilot", 1800));
        s1.addEpisode(new Episode("Episode 2", 1700));

        Season s2 = new Season();
        s2.addEpisode(new Episode("Episode 1", 1900));
        s2.addEpisode(new Episode("Episode 2", 1750));

        List<Season> seasons = Arrays.asList(s1, s2);

        System.out.println("-- Normal --");
        for (Episode e : s1) System.out.println(e);

        System.out.println("-- Reverse --");
        EpisodeIterator revIt = new ReverseSeasonIterator(s1);
        while (revIt.hasNext()) System.out.println(revIt.next());

        System.out.println("-- Shuffle (seed=42) --");
        EpisodeIterator shufIt = new ShuffleSeasonIterator(s1, 42);
        while (shufIt.hasNext()) System.out.println(shufIt.next());

        System.out.println("-- Binge --");
        EpisodeIterator binge = new BingeIterator(seasons);
        while (binge.hasNext()) System.out.println(binge.next());
    }
}