package com.davidbonelo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Music Library!");
        MusicLibrary musicLibrary = new MusicLibrary();

        for (Song song : musicLibrary.getSongs()) {
            System.out.println(song);

        }
    }
}