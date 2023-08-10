package com.elrancho.pwi.io.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elrancho.pwi.io.entity.AreaEntity;

@Repository
public interface AreaRepository extends CrudRepository<AreaEntity, Long>{
	
	public AreaEntity findAreaByDescription(String areaDescription);
	public AreaEntity findAreaByAreaId(long areaId);

}
