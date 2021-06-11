package com.example.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

//import com.example.demo.Entity.Klient;

@Entity
public class Serwisant extends Pracownik {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@ElementCollection(targetClass = Naprawa.class)
	List<Naprawa> listNapraw;
	
	@OneToMany
	List<SerwisantNaprawa> list = new ArrayList<>();
}
