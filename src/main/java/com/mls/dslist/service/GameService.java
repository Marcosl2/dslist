package com.mls.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mls.dslist.dto.GameMinDTO;
import com.mls.dslist.entyties.Game;
import com.mls.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		 return result.stream().map(x-> new GameMinDTO(x)).toList();
		
		
	}

}
