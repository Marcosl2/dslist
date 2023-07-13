package com.mls.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mls.dslist.entyties.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
