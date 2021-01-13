package ru.netology.manager.manager;

import org.junit.jupiter.api.Test;
import ru.netology.manager.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;


    public class ScheduleManagerTest {
        @Test
        public void shouldGetLastMovies() {
            ScheduleManager manager = new ScheduleManager();
            MovieItem first = new MovieItem(1, 1, "Movie 1", "comedy", "first.jpg", 1610473609);
            MovieItem second = new MovieItem(2, 2, "Movie 2", "horror", "second.jpg", 1610473620);
            MovieItem third = new MovieItem(3, 3, "Movie 3", "drama", "third.jpg", 1610473628);
            manager.add(first);
            manager.add(second);
            manager.add(third);
            MovieItem[] actual = manager.getLastMovies();
            MovieItem[] expected = new MovieItem[]{third, second, first};
            assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldGetLastTwoMovies() {
            ScheduleManager manager = new ScheduleManager(2);
            MovieItem first = new MovieItem(1, 1, "Movie 1", "comedy", "first.jpg", 1610473609);
            MovieItem second = new MovieItem(2, 2, "Movie 2", "horror", "second.jpg", 1610473620);
            MovieItem third = new MovieItem(3, 3, "Movie 3", "drama", "third.jpg", 1610473628);
            manager.add(first);
            manager.add(second);
            manager.add(third);
            MovieItem[] actual = manager.getLastMovies();
            MovieItem[] expected = new MovieItem[]{third, second};
            assertArrayEquals(expected, actual);
        }
    }