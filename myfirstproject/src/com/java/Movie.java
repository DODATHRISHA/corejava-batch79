package com.java;

public class Movie {
	
	String moviename;
	double Movierating;
	int Movieprice;
	String movieduration;
	boolean isreleased;
	

	public static void main(String[] args) {
		Movie m = new Movie();
		m.moviename = "RRR";
		m.Movierating = 7.5;
		m.Movieprice = 150;
		m.movieduration = "one hour";
		m.isreleased = false;
		
		System.out.println("moviename:"+m.moviename);
		System.out.println("Movierating:"+m.Movierating);
		System.out.println("Movieprice:"+m.Movieprice);
		System.out.println("movieduration:"+m.movieduration);
		System.out.println("isreleased:"+m.isreleased);

	}

}
