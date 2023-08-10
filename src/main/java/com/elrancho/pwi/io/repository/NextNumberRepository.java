package com.elrancho.pwi.io.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.elrancho.pwi.io.entity.NextNumberEntity;

@Repository
public interface NextNumberRepository extends CrudRepository<NextNumberEntity, Long>{

	public NextNumberEntity findNextNumberEntityByTableName(String tableName);
	
}
