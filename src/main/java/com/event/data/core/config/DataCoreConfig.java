package com.event.data.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

@Configuration
public class DataCoreConfig extends AbstractMongoConfiguration {
	private @Value("#{myProperties['databaseName']}") String databaseName;
	
	@Override
	public @Bean Mongo mongo() throws Exception {
		return new Mongo("localhost");
	}
	
	@Override
	public @Bean MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), "test");
	}

	@Override
	public String getDatabaseName() {
		return this.databaseName;
	}
}
