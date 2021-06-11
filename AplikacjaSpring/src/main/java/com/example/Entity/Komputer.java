package com.example.Entity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
//@Entity

//@MappedSuperclass
@Entity
@Inheritance
public class Komputer{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	
	
	private int nrSeryjny;
	@ElementCollection(targetClass = String.class)
	private List<String> podzespoły;
	private int cenaMontazu;
	private String instrukcjaObslugi;
	@OneToMany
	private List<ModerBuduje> moderBuduje;

}
