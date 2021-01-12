package ru.netology.manager.manager;

import ru.netology.manager.domain.MovieItem;

public class ScheduleManager {
    private MovieItem[] items = new MovieItem[0];
    private int movieNumber;

    public ScheduleManager () {
        this.movieNumber = 10;
    }

    public ScheduleManager (int movieNumber) {
        this.movieNumber = movieNumber;
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getLastMovies() {
        int count = this.movieNumber;

        if (count > items.length) {
            count = items.length;
        }

        MovieItem[] result = new MovieItem[count];

        int j = 0;
        for (int i = items.length - 1; i >= items.length - count; i--) {
            result[j] = items[i];
            j++;
        }
        return result;
    }



}
