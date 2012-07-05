package com.event.data.core.repository.spi;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import com.event.data.core.domain.User;
import com.event.data.core.repository.UserRepository;

public class UserRepositoryImpl extends SimpleMongoRepository<User, Long> implements UserRepository {

	public UserRepositoryImpl(MongoEntityInformation<User, Long> metadata,
			MongoOperations mongoOperations) {
		super(metadata, mongoOperations);
	}
}
