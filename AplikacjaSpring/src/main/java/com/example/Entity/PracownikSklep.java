package com.example.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PracownikSklep {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	private Pracownik pracownik;

	@ManyToOne
	private Sklep sklep;

	private LocalDate OdKiedyPracuje;
	private LocalDate DoKiedyPracuje;

	public PracownikSklep() {
		// TODO Auto-generated constructor stub
	}	
	public PracownikSklep(int id, Pracownik pracownik, Sklep sklep, LocalDate odKiedyPracuje, LocalDate doKiedyPracuje) {
		super();
		this.id = id;
		this.pracownik = pracownik;
		this.sklep = sklep;
		OdKiedyPracuje = odKiedyPracuje;
		DoKiedyPracuje = doKiedyPracuje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pracownik getPracownik() {
		return pracownik;
	}



	public void setPracownik(Pracownik pracownik) {
		this.pracownik = pracownik;
	}

	public Sklep getSklep() {
		return sklep;
	}

	public void setSklep(Sklep sklep) {
		this.sklep = sklep;
	}

	public LocalDate getOdKiedyPracuje() {
		return OdKiedyPracuje;
	}

	public void setOdKiedyPracuje(LocalDate odKiedyPracuje) {
		OdKiedyPracuje = odKiedyPracuje;
	}

	public LocalDate getDoKiedyPracuje() {
		return DoKiedyPracuje;
	}

	public void setDoKiedyPracuje(LocalDate doKiedyPracuje) {
		DoKiedyPracuje = doKiedyPracuje;
	}

}
