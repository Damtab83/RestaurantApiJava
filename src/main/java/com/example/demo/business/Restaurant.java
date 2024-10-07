package com.example.demo.business;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	
	private List<Table> tables = new ArrayList<Table>();
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	public Restaurant() {}
	
	public Restaurant(String nom, String adresse, String telephone, String email) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone + ", email=" + email
				+ ", tables=" + tables + ", reservations=" + reservations + "]";
	}
	
	
	public static Restaurant creationDeNotreRestaurant() {
		
		Restaurant restaurant = new Restaurant(
				"Chez Dam", 
				"rue de la dégustation", 
				"555 444 32 10", 
				"chezmoi@test.fr");
		
		restaurant.ajouterTable(1, 6);
		restaurant.ajouterTable(2, 2);
		restaurant.ajouterTable(3, 2);
		restaurant.ajouterTable(4, 4);
		
		return restaurant;
	}

	private void ajouterTable(int numeroTable, int nombreCouverts) {
		tables.add(new Table(numeroTable, nombreCouverts));
		
	}
	
	
}
