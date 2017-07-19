package com.etn.ss.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etn.ss.poc.domain.Friends;

public interface FriendsRepo extends JpaRepository<Friends, Integer> {

}
