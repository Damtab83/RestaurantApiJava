package com.example.demo.business;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;

public class DemandeReservation {
	
	private int nombreCouverts;
	private LocalDateTime horaire;
	private String prenom;
	private String nom;
	
	public DemandeReservation() {}
	
	public DemandeReservation(int nombreCouverts, LocalDateTime horaire, String prenom, String nom) {
		super();
		this.nombreCouverts = nombreCouverts;
		this.horaire = horaire;
		this.prenom = prenom;
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDateTime getHoraire() {
		return horaire;
	}
	public void setHoraire(LocalDateTime horaire) {
		this.horaire = horaire;
	}
	public int getNombreCouverts() {
		return nombreCouverts;
	}
	public void setNombreCouverts(int nombreCouverts) {
		this.nombreCouverts = nombreCouverts;
	}

	@Override
	public String toString() {
		return "DemandeReservation [nombreCouverts=" + nombreCouverts + ", horaire=" + horaire + ", prenom=" + prenom
				+ ", nom=" + nom + "]";
	}
	
	
}
