package com.elrancho.pwi.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.elrancho.pwi.io.entity.NextNumberEntity;
import com.elrancho.pwi.io.repository.NextNumberRepository;
import com.elrancho.pwi.service.NextNumberService;
import com.elrancho.pwi.shared.dto.NextNumberDto;

public class NextNumberServiceImpl implements NextNumberService {

	@Autowired
	NextNumberRepository nextNumberRepository;
	
	
	@Override
	public NextNumberDto getNextNumberDto(String tableName) {
		
		NextNumberEntity nextNumberEntity = nextNumberRepository.findNextNumberEntityByTableName(tableName);
		return new ModelMapper().map(nextNumberEntity, NextNumberDto.class);
	}
	


	@Override
	public void setNextNumberDto(String tableName, long nextNumber) {
		
		NextNumberDto nextNumberDto = getNextNumberDto(tableName);
		nextNumberDto.setNextNumber(nextNumber);
		
		NextNumberEntity nextNumberEntity = new ModelMapper().map(nextNumberDto, NextNumberEntity.class);
		
		nextNumberRepository.save(nextNumberEntity);		
	}

}
