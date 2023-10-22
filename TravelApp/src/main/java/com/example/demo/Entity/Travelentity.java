package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Travelentity {
    @Id
    private int id;
	private String name;
    private String description;
    private String attractions;
    private String accommodations;
    private String localCuisine;
    private String travelTips;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAttractions() {
		return attractions;
	}
	public void setAttractions(String attractions) {
		this.attractions = attractions;
	}
	public String getAccommodations() {
		return accommodations;
	}
	public void setAccommodations(String accommodations) {
		this.accommodations = accommodations;
	}
	public String getLocalCuisine() {
		return localCuisine;
	}
	public void setLocalCuisine(String localCuisine) {
		this.localCuisine = localCuisine;
	}
	public String getTravelTips() {
		return travelTips;
	}
	public void setTravelTips(String travelTips) {
		this.travelTips = travelTips;
	}
	public Travelentity(int id, String name, String description, String attractions, String accommodations,
			String localCuisine, String travelTips) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.attractions = attractions;
		this.accommodations = accommodations;
		this.localCuisine = localCuisine;
		this.travelTips = travelTips;
	}
	public Travelentity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
