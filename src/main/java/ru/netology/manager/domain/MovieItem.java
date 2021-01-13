package ru.netology.manager.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class MovieItem {
    private int id;
    private int movieId;
    private String movieName;
    private String genre;
    private String movieImage;
    private int dateTime;
}
