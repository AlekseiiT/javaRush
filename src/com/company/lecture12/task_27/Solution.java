package com.company.lecture12.task_27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;
        while ((key = reader.readLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) movie = new SoapOpera();
            if ("cartoon".equals(key)) movie = new Cartoon();
            if ("thriller".equals(key)) movie = new Thriller();

            return movie;
        }
    }

    static abstract class Movie {
    }
    static class SoapOpera extends Movie {
    }
    static class Cartoon extends Movie {
    }
    static class Thriller extends Movie {
    }
}