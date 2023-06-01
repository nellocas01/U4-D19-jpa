package com.example.U4D19jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U4D19jpa.entities.Film;

@Service
public class FilmService {
	@Autowired
	private FilmRepository filmrepo;

	public void create(Film f) {
		filmrepo.save(f);
	}

}
