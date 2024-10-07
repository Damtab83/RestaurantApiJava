package com.example.demo.business;

public class Table {

	private int numeroTable;
	private int nombreCouvert;
	
	public Table() {}
	
	public Table(int numeroTable, int nombreCouvert) {
		this.numeroTable = numeroTable;
		this.nombreCouvert = nombreCouvert;
	}
	public int getNumeroTable() {
		return numeroTable;
	}
	public void setNumeroTable(int numeroTable) {
		this.numeroTable = numeroTable;
	}
	public int getNombreCouvert() {
		return nombreCouvert;
	}
	public void setNombreCouvert(int nombreCouvert) {
		this.nombreCouvert = nombreCouvert;
	}
	
	
	
	@Override
	public String toString() {
		return "Table [numeroTable=" + numeroTable + ", nombreCouvert=" + nombreCouvert + "]";
	}
	
	
	
}
