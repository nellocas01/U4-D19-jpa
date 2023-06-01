package com.example.U4D19jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.U4D19jpa.dao.FilmService;
import com.example.U4D19jpa.entities.Film;

@Component
public class FilmsRunner implements CommandLineRunner {
	@Autowired
	FilmService filmservice;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Film f = new Film();
		f.setName("harry potter1");
		f.setGender("fantasy");
		f.setActor("pavarotti");

		System.out.println("********FILM CREATO********");
		filmservice.create(f);
	}

}
