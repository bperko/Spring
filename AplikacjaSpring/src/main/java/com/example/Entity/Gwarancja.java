package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Gwarancja {
	
	@Id
	int ID;
	private int liczbaLat;
//	//private String id;
//	@ManyToOne
//	private Stacjonarny stacjonarny;
//	
//	//prywatny konstuktor do kompozycji nie mozna go z zewnatrz wywolac dla I zasady
//	private Gwarancja(int liczbaLat, Stacjonarny stacjonarny) {
//		//super();
//		//this.id=id;
//		this.liczbaLat = liczbaLat;
//		this.stacjonarny = stacjonarny;
//		
//	}
//	//Tworzymy statyczna metode zwraca gw,przyjmuje całość i sprawdza czy ta całość istnieje dla zasady I
//	public static Gwarancja podbijGwarancje(Stacjonarny stacjonarny,int liczbaLat) throws Exception
//	{
//		if(stacjonarny==null)
//		{
//			throw new Exception("Komputer nie istnieje");
//		}
//		
//		Gwarancja gwarancja = new Gwarancja(liczbaLat, stacjonarny);
//		//II zasada
//		stacjonarny.addGwarancja(gwarancja);
//		
//		return gwarancja;
//	}
//
//	@Override
//	public String toString() {
//		return "Gwarancja [liczbaLat=" + liczbaLat + ", id="+ "]";
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		//result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + liczbaLat;
//		result = prime * result + ((stacjonarny == null) ? 0 : stacjonarny.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Gwarancja other = (Gwarancja) obj;
//		//if (id == null) {
//		//	if (other.id != null)
//		//		return false;
//		//} else if (!id.equals(other.id))
//		//	return false;
//		if (liczbaLat != other.liczbaLat)
//			return false;
//		if (stacjonarny == null) {
//			if (other.stacjonarny != null)
//				return false;
//		} else if (!stacjonarny.equals(other.stacjonarny))
//			return false;
//		return true;
//	}
//	
//	
//	
//	

}
