package com.etn.ss.poc.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.etn.ss.poc.domain.Friends;
import com.etn.ss.poc.service.FriendService;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;

@SpringUI
@Theme("valo")
public class FriendUI extends UI {

	private static final long serialVersionUID = 572757772544476920L;
	FriendService friendService;
	Grid<Friends> grid;

	@Autowired
	public FriendUI(FriendService friendService) {
		this.friendService = friendService;
		this.grid = new Grid<>(Friends.class);
	}

	@Override
	protected void init(VaadinRequest request) {
		setContent(grid);
		grid.setItems(friendService.findAll());
	}

	// @Override
	// protected void init(VaadinRequest request) {
	// setContent(new Button("Click me", e -> Notification.show("Hello
	// Spring+Vaadin user!")));
	//
	// }

}
