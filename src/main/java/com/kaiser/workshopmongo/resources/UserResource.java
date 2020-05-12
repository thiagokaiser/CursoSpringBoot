package com.kaiser.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kaiser.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "name", "email");
		User thiago = new User("2", "name", "email");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,thiago));
		
		return ResponseEntity.ok().body(list);
	}
}
