package ch17.lecture.p03intermediate;

import java.util.*;

public class C17Sorted {
	public static void main(String[] args) {
		List<Movie> movie = List.of(
				new Movie("avatar", 10000),
				new Movie("slamdunk", 9000),
				new Movie("avengers", 7000),
				new Movie("titanic", 15000));

		movie.stream()
				.sorted((a, b) -> a.getPrice() - b.getPrice())
				.forEach(System.out::println);
		System.out.println();

		movie.stream()
				.sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
				.forEach(System.out::println);

	}
}

class Movie {
	private String title;
	private int price;

	public Movie(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

}
