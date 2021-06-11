package com.example.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ModerBuduje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	private LocalDate dataOd;
	private LocalDate dataDo;
	private String imie;
	private String nazwisko;
	
	@ManyToOne
	Komputer komputer;
	@ManyToOne
	Moder moder;

}
