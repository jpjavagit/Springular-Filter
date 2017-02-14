package br.com.spring.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.spring.entities.Person;

@Service
public class Logic {
	
	public List<Person> getListPersons(){
		List<Person> listReturn = new ArrayList<Person>();
		listReturn.add(new Person("Malcon", 12));
		listReturn.add(new Person("John Paul", 29));
		listReturn.add(new Person("Monica", 30));
		listReturn.add(new Person("Jerry", 35));
		listReturn.add(new Person("Fabiola", 48));
		return listReturn;
	}
	
}
