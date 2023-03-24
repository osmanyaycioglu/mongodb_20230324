package com.training.mongodb.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICommentMongoDao extends MongoRepository<Comment,String> {
}
