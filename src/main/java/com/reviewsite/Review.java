package com.reviewsite;

public class Review {

	private Long id;
	private String name;
	private String description;
	private String category;
	private String imgUrl;

	public Review(long id, String name, String description, String category, String imgUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}

}
