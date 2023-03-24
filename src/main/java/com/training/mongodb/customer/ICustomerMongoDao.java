package com.training.mongodb.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ICustomerMongoDao extends MongoRepository<Customer,String> {

    List<Customer> findAllByFirstName(String name);

    List<Customer> findAllByFirstNameAndLastName(String name,String surname);

    List<Customer> findAllByWeightBetween(Integer min,Integer max);

    @Query("{firstName: ?0}")
    List<Customer> searchCustomerWithFirstName(String name);

    @Query(value = "{lastName: ?0}",fields = "{firstName : 1,lastName : 1}")
    List<Customer> searchCustomerWithLastName(String surname);

}
