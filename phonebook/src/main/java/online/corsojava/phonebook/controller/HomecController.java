package online.corsojava.phonebook.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import online.corsojava.phonebook.model.Contact;
import java.util.List;

@RestController
public class HomecController {
	
	//ogni requestmap genera un endpoint
	@RequestMapping(value = "/vediamo", method = RequestMethod.GET)
	//uso hashmap per avere un sistema chiave valore come in json
	public HashMap<String, String > vediamo() {
		
		HashMap <String, String> result = new HashMap<> ();
		result.put("valore 1", "ciao");
		result.put("valore 2", "ciao di nuovo");
		
		return result;
	}
	
	
	//avrò un json in cui le chiavi sono le property e i valori sono quelli assegnati
	@RequestMapping(value = "/contatto", method = RequestMethod.GET)
	public Contact contatto () {
		return new Contact("Franco", "rossi", "3328564135");
	}
	
	
	@RequestMapping (value = "/contatti", method = RequestMethod.GET)
	public List<Contact> contatti(){
		List<Contact> result = new ArrayList<> ();
		result.add( new Contact ("Franco", "rossi", "3328564135") );
		result.add( new Contact ("ddd", "ddddd", "3328564135") );
		result.add( new Contact ("eee", "eee", "3328564135") );
		result.add( new Contact ("www", "rowwwwwwssi", "3328564135") );
		
		return result;
		
	}

}
