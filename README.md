# Iterator Pattern 

This mini-project demonstrates the **Iterator** design pattern by simulating a “binge-mode” episode player for a streaming service.

---

## Table of Contents

1. [Overview](#overview)  
2. [Project Structure](#project-structure)  

---

## Overview

A TV series consists of multiple seasons, each storing its episodes differently (e.g. `ArrayList`, `LinkedList`, or a lazy file loader). We provide a uniform `EpisodeIterator` interface so client code can traverse episodes without knowing how they’re stored.  

Supported traversal modes:

- **Normal order** (`SeasonIterator`)  
- **Reverse order** (`ReverseSeasonIterator`)  
- **Shuffled order** with a fixed seed (`ShuffleSeasonIterator`)  
- **Binge mode** across all seasons (`BingeIterator`)

---

## Project Structure


- **Episode.java** – model class for an episode (title, runtime).  
- **EpisodeIterator.java** – exposes `hasNext()` / `next()`.  
- **Season.java** – holds episodes and implements `Iterable<Episode>`.  
- **SeasonIterator**, **ReverseSeasonIterator**, **ShuffleSeasonIterator** – different traversal strategies for a single season.  
- **BingeIterator** – chains multiple seasons end-to-end.  
- **Main.java** – demo showing all iterator behaviors.

---
