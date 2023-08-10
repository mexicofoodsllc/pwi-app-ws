package com.elrancho.pwi.service;

import org.springframework.stereotype.Service;

import com.elrancho.pwi.shared.dto.NextNumberDto;

@Service
public interface NextNumberService {

	public NextNumberDto getNextNumberDto(String tableName);
	public void setNextNumberDto(String tableName, long nextNumber);
}
