package com.java.Constructor;
 

public class Movie {
	
	String name;
	String hero;
	String director;
	String heroine;
	double budget;
	
	Movie(){
		System.out.println("No-arg constructor called");
	}
	Movie(Movie m){
		this.name = m.name;
		this.hero = m.hero;
		this.director = m.director;
		this.heroine = m.heroine;
		this.budget =m. budget;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m = new Movie();
		m.director="rajamouli";
		m.hero = "mahesh babu";
		m.name = "varanasi";
		m.budget = 1000000.0;
		m.movieInfo();
		
		Movie m1 = new Movie(m);
		m1.movieInfo();
		
		System.out.println("main method started");

	}
	
	void movieInfo() {
		
		System.out.println("name of the movie:"+name);
		System.out.println("name of the movie:"+hero);
		System.out.println("name of the movie:"+ director);
		System.out.println("name of the movie:"+ heroine);
		System.out.println("name of the movie:"+budget);
		System.out.println("***************");
	}

}
