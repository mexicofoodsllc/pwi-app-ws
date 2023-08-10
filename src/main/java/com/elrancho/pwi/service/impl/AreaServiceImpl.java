package com.elrancho.pwi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elrancho.pwi.io.entity.AreaEntity;
import com.elrancho.pwi.io.repository.AreaRepository;
import com.elrancho.pwi.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	AreaRepository areaRepository;
	
	@Override
	public String getAreaDescription(long areaId) {
		AreaEntity areaEntity =areaRepository.findAreaByAreaId(areaId);
		return areaEntity.getDescription();
	}

}
