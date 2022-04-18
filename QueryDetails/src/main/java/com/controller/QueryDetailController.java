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

import com.dao.HallService;
import com.dao.MoviesService;
import com.dao.ShowService;
import com.model.Hall;
import com.model.Movies;
import com.model.Show;

@RestController
public class QueryDetailController {
@Autowired 
ShowService service;


@PostMapping("/addshow")
public ResponseEntity<?> addShow(@RequestBody Show s){
	service.add(s);
	return ResponseEntity.ok("show added ");
}
@GetMapping("/getallshows")
public List<Show> getDetails(){
	return service.findAllShows();
}
@GetMapping("/findshow{id}")
public Show findShow(@PathVariable int id)throws ShowIdException {
	Show show=service.findShow(id);
	if(show==null) {
		throw new ShowIdException(id);
	}
	else
	return service.findShow(id);
}
@GetMapping("/showbyhallid/{id}")
public List<Show> findShows(@PathVariable int id) throws HallIdExceptionController{
	Show show=service.findShow(id);
	if(show==null) {
		throw new HallIdExceptionController(id);
	}
	else {
	return service.findByHallId(id);
	}
}
@DeleteMapping("deleteshow/{id}")
public ResponseEntity<?> deleteShow(@PathVariable int id){
	service.delete(id);
	return ResponseEntity.ok("show deleted successfully");
}
}
