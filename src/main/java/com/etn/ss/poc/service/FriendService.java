package com.etn.ss.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etn.ss.poc.domain.Friends;
import com.etn.ss.poc.repo.FriendsRepo;

@Service
public class FriendService {

	@Autowired
	private FriendsRepo friendsRepo;

	public List<Friends> findAll() {
		return friendsRepo.findAll();
	}
}
