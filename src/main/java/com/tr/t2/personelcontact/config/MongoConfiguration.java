package com.tr.t2.personelcontact.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.tr.t2.dao")
public class MongoConfiguration extends AbstractMongoConfiguration
{

	@Override
	protected String getDatabaseName()
	{
		return "test";
	}

	@Override
	public Mongo mongo() throws Exception
	{
		return new MongoClient(new ServerAddress("localhost", 27017));
	}

}
