package com.example.demo;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.repository.IPracownikSklep;
import com.example.repository.IPracownikRepository;
import com.example.repository.ISklepRepository;

//import com.example.demo.Entity.Multiplex;
//import com.example.demo.Entity.Room;
//import com.example.demo.Entity.Screening;
//import com.example.demo.Entity.ScreeningTime;
//import com.example.demo.Entity.Seat;
//import com.example.demo.Repositories.MultiplexRepository;
//import com.example.demo.Repositories.RoomRepositories;
//import com.example.demo.Repositories.ScreeningRepository;

@SpringBootApplication
public class AplikacjaSpring {

	public static void main(String[] args) {
		SpringApplication.run(AplikacjaSpring.class, args);
	}
	//@Autowired
//	@PersistenceContext
//	EntityManager entityManager;
//	@Autowired
//	IPracownikRepository klientRepository;
//	@Autowired
//	ISklepRepository sklepRepository;
//	@Autowired
//	IPracownikSklep klientsklep;
//	@Autowired
//	RepositoryGwarancja ig;
//	@Autowired
//	IStacjonarny is;
//	@Bean
	//@Transactional
//	public CommandLineRunner demo()
//	{
////		ArrayList<Seat> list= new ArrayList<>();
////		ArrayList<ScreeningTime> list2= new ArrayList<>();
//		//return args ->{
//		//Pracownik klient = new Pracownik("cos");
//		Sklep sklep = new Sklep("jakis");
//		//KlientSklep sklepKlient = new KlientSklep("1234",klient,sklep);
//		//Stacjonarny s = new Stacjonarny(new Wlasciciel("xyz"));
//		
////		Gwarancja a = new Gwarancja(1, s);
////		Gwarancja b = new Gwarancja(2,s);
//		//s.addGwarancja();
//		//s.addGwarancja();
//		Gwarancja.podbijGwarancje(s, 0);
//		
////		entityManager.persist(klient);
////		entityManager.persist(sklep);	
//		//klientRepository.save(klient);
//		sklepRepository.save(sklep);
//		//klientsklep.save(sklepKlient);
//		is.save(s);
		
		
//		Multiplex multiplex = new Multiplex();
//		Room room = new Room(1,11,list,multiplex);
//		Screening screening = new Screening("xxxx", list2);
//		multiplexRepository.save(multiplex);
//		roomRepositories.save(room);
//		screeningRepository.save(screening);
//		};
	}
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

//}
