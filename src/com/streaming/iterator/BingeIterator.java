package com.streaming.iterator;

import java.util.*;

public class BingeIterator implements EpisodeIterator {
    private final Iterator<Season> seasonIt;
    private EpisodeIterator currentEpIt;

    public BingeIterator(List<Season> seasons) {
        this.seasonIt = seasons.iterator();
        advanceSeason();
    }

    private void advanceSeason() {
        if (seasonIt.hasNext()) {
            currentEpIt = new SeasonIterator(seasonIt.next());
        } else {
            currentEpIt = null;
        }
    }

    @Override
    public boolean hasNext() {
        while (currentEpIt != null) {
            if (currentEpIt.hasNext()) return true;
            advanceSeason();
        }
        return false;
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return currentEpIt.next();
    }
}