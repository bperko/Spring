package com.example.Entity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import jdk.nashorn.internal.runtime.ECMAException;
@Entity
public class SerwisantNaprawa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	private LocalDate DataOd;
	private LocalDate DataDo;
	private String imie;
	private String nazwisko;
	
	@ManyToOne
	Serwisant serwisant;
	
	@ManyToOne
	Naprawa naprawa;
	
	public SerwisantNaprawa() {
		// TODO Auto-generated constructor stub
	}

	public SerwisantNaprawa(int id, LocalDate dataOd, LocalDate dataDo, String imie, String nazwisko,
			Serwisant serwisant, Naprawa naprawa) {
		super();
		this.id = id;
		DataOd = dataOd;
		DataDo = dataDo;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.serwisant = serwisant;
		this.naprawa = naprawa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataOd() {
		return DataOd;
	}

	public void setDataOd(LocalDate dataOd) {
		DataOd = dataOd;
	}

	public LocalDate getDataDo() {
		return DataDo;
	}

	public void setDataDo(LocalDate dataDo) {
		DataDo = dataDo;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Serwisant getSerwisant() {
		return serwisant;
	}

	public void setSerwisant(Serwisant serwisant) {
		this.serwisant = serwisant;
	}

	public Naprawa getNaprawa() {
		return naprawa;
	}

	public void setNaprawa(Naprawa naprawa) {
		this.naprawa = naprawa;
	}
	
	
	
	
	
	
}
