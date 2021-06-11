package com.example.Entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionType;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
//@Table(name = "sklep")
public class Sklep {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "sklep_id")
	int id;
	
	@OneToMany
	List<PracownikSklep> list = new ArrayList<>();
	
	
	private String Addres;
//	@Autowired
//	private Pracownik danePracownikow;
	private String numerTelefonu;
	@ElementCollection(targetClass = Pracownik.class)
	private List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();

	public void getDanePracownikow() {
		for(Pracownik i:listaPracownikow)
		{
			System.out.println(i);
		}
		//return danePracownikow;
	}

//	public void setDanePracownikow(Pracownik danePracownikow) {
//		this.danePracownikow = danePracownikow;
//	}

	public String getNumerTelefonu() {
		return numerTelefonu;
	}

	public void setNumerTelefonu(String numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}

	public List<Pracownik> getListaPracownikow() {
		return listaPracownikow;
	}

	public void setListaPracownikow(List<Pracownik> listaPracownikow) {
		this.listaPracownikow = listaPracownikow;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddres() {
		return Addres;
	}

	public void setAddres(String addres) {
		Addres = addres;
	}

	public Sklep(String addres) {
		super();

		Addres = addres;
	}

	public Sklep() {
		// TODO Auto-generated constructor stub
	}
}
