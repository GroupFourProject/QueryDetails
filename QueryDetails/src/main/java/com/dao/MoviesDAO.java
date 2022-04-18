package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Movies;

@Repository
public interface MoviesDAO {

	public void addMovies(Movies movies);
	public Movies findMovies(int movieId);
	public Movies findMovieByName(String s);
	public List<Movies> findAllMovies();
	public boolean updateMovies(Movies movies);
	public boolean deleteMovies(int id);
	
}
