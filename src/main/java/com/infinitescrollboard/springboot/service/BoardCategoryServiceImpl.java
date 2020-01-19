package com.infinitescrollboard.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinitescrollboard.springboot.model.BoardCategory;
import com.infinitescrollboard.springboot.repository.BoardCategoryRepository;

@Service
public class BoardCategoryServiceImpl implements BoardCategoryService {

	@Autowired
	BoardCategoryRepository boardCategoryRepository;
	
	@Override
	public List<BoardCategory> getCategories() {
		return boardCategoryRepository.findAll();
	}

}
