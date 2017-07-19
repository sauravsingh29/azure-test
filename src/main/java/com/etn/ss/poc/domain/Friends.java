package com.etn.ss.poc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friends implements Serializable {

	private static final long serialVersionUID = -489927514963522934L;
	@Id
	int id;
	String name;
	@Column(name = "fav_drink")
	String favoriteDrink;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFavoriteDrink() {
		return favoriteDrink;
	}

	public void setFavoriteDrink(String favoriteDrink) {
		this.favoriteDrink = favoriteDrink;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Friends [id=").append(id).append(", name=").append(name).append(", favoriteDrink=")
				.append(favoriteDrink).append("]");
		return builder.toString();
	}

}
