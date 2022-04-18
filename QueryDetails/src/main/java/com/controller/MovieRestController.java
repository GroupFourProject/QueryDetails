package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.MoviesService;
import com.model.Movies;
import com.model.Show;

@RestController
public class MovieRestController {
@Autowired
MoviesService service;
@PostMapping("/addMovie")
public ResponseEntity<?> addMoive(@RequestBody Movies m){
	service.add(m);
	return ResponseEntity.ok("Movie added");
}
@GetMapping("/getshowsbymovie/{name}")
public List<Show> getByMovie(@PathVariable String s) throws MovieNameException{
	Movies movie=service.findByName(s);
	if(movie==null) {
		throw new MovieNameException(s);
	}
	else
   return movie.getShows();

}
@DeleteMapping("deletemovie/{id}")
public ResponseEntity<?> deleteMovie(@PathVariable int id){
	service.delete(id);
	return ResponseEntity.ok("Movie deleted successfully");
}
}
