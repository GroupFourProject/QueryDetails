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
import com.model.Hall;
import com.model.Show;

@RestController
public class HallRestController {
@Autowired
HallService service;
@PostMapping("/addhall")
public ResponseEntity<?> addhall(@RequestBody Hall hall){
	service.add(hall);
	return ResponseEntity.ok("hall added");
}
@DeleteMapping("deletehall/{id}")
public ResponseEntity<?> deleteHall(@PathVariable int id){
	service.delete(id);
	return ResponseEntity.ok("hall deleted successfully");
}
}
