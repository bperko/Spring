package com.example.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.Transactional;

@Entity
//@MappedSuperclass()
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(name = "pracownik")
public class Pracownik {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "klient_id")
	int id;
	private String imie;
	private String nazwisko;
	private int iloscGodzinWPracy;
	
	@OneToMany
	List<PracownikSklep> list = new ArrayList<>();
	
	public Pracownik() {
		// TODO Auto-generated constructor stub
	}
	public Pracownik(String imie,String nazwisko,int iloscGodzinwPracy) {
		super();
		this.nazwisko=nazwisko;
		this.iloscGodzinWPracy=iloscGodzinwPracy;
		this.imie = imie;
	}

	public int getId() {
		return id;
	}

	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getIloscGodzinWPracy() {
		return iloscGodzinWPracy;
	}
	public void setIloscGodzinWPracy(int iloscGodzinWPracy) {
		this.iloscGodzinWPracy = iloscGodzinWPracy;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}
	@Transient
	public double WysokoscPensji(int stawkaGodzinowa)
	{
		return iloscGodzinWPracy*stawkaGodzinowa;
	}

	

}
