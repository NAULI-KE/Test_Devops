package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository
		extends PagingAndSortingRepository<User, String>, JpaSpecificationExecutor<User> {

}
