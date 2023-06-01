package com.example.U4D19jpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.U4D19jpa.entities.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

	Optional<Film> findByName(String name);

	List<Film> findByNameStartingWithIgnoreCase(String name);

	List<Film> findByNameAndActor(String name, String actor);

}
