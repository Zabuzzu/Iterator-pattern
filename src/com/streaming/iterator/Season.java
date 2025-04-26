package com.streaming.iterator;

import java.util.*;

public class Season implements Iterable<Episode> {
    private final List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    List<Episode> getEpisodes() {
        return Collections.unmodifiableList(episodes);
    }

    @Override
    public Iterator<Episode> iterator() {
        return new SeasonIterator(this);
    }
}