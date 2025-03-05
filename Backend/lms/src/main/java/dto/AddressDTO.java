package dto;

import model.Place;

public class AddressDTO {
	private Long id;
	private String street;
	private int houseNumber;
	private PlaceDTO place;
	
	public AddressDTO() {}
	public AddressDTO(Long id, String street, int houseNumber, PlaceDTO place) {
		super();
		this.id = id;
		this.street = street;
		this.houseNumber = houseNumber;
		this.place = place;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public PlaceDTO getPlace() {
		return place;
	}
	public void setPlace(PlaceDTO place) {
		this.place = place;
	}
	
	
	
	
}
