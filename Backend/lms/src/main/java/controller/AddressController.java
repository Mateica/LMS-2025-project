package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import dto.AddressDTO;
import dto.PlaceDTO;
import model.Address;
import model.Place;
import service.ServiceInterface;

@Controller
@RequestMapping(path = "/api/addresses")
public class AddressController implements ControllerInterface<AddressDTO>{
	@Autowired
	private ServiceInterface<Address> service;

	public AddressController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressController(ServiceInterface<Address> service) {
		super();
		this.service = service;
	}

	public ServiceInterface<Address> getService() {
		return service;
	}

	public void setService(ServiceInterface<Address> service) {
		this.service = service;
	}

	@Override
	@GetMapping
	public ResponseEntity<Iterable<AddressDTO>> findAll() {
		ArrayList<AddressDTO> addresses = new ArrayList<AddressDTO>();
		
		for(Address a : service.findAll()) {
			Place p = a.getPlace();
			
			PlaceDTO placeDTO = new PlaceDTO();
			
			placeDTO.setName(p.getName());
			
			addresses.add(new AddressDTO(null,a.getStreet(), a.getHouseNumber(),placeDTO));
		}
		
		return new ResponseEntity<Iterable<AddressDTO>>(addresses, HttpStatus.OK);
	}

	@Override
	@GetMapping(path = "/{id}")
	public ResponseEntity<AddressDTO> findById(@PathVariable("id") Long id) {
		
		Address a = service.findById(id).orElse(null);
		
		if(a == null) {
			return new ResponseEntity<AddressDTO>(HttpStatus.NOT_FOUND);
		}
	
		AddressDTO dto = new AddressDTO();
		PlaceDTO placeDTO = new PlaceDTO();
		
		placeDTO.setName(a.getPlace().getName());
		
		return new ResponseEntity<AddressDTO>(dto, HttpStatus.OK);
	}

	@Override
	@PostMapping
	public ResponseEntity<AddressDTO> create(@RequestBody AddressDTO t) {
		Address a = service.create(new Address(t.getStreet(), t.getHouseNumber(), null));
		
		Place place = new Place();
		
		//place.setName(t.getPlace().getName());
		
		a.setPlace(place);
		
		
		return new ResponseEntity<AddressDTO>(HttpStatus.CREATED);
	}

	@Override
	@PutMapping(path = "/{id}")
	public ResponseEntity<AddressDTO> update(@RequestBody AddressDTO t, @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		Address a = service.findById(id).orElse(null);
		
		if(a == null) {
			return new ResponseEntity<AddressDTO>(HttpStatus.NOT_FOUND);
		}
		
		AddressDTO address = new AddressDTO();
		PlaceDTO place = new PlaceDTO();
		
		address.setStreet(a.getStreet());
		address.setHouseNumber(a.getHouseNumber());
		address.setPlace(place);
		
		a = service.update(a);
		
		return new ResponseEntity<AddressDTO>(HttpStatus.OK);
	}

	@Override
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<AddressDTO> delete(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		Address a  = this.service.findById(id).orElse(null);
		
		if(a == null) {
			return new ResponseEntity<AddressDTO>(HttpStatus.NOT_FOUND);
		}
		
		this.service.delete(id);
		return new ResponseEntity<AddressDTO>(HttpStatus.OK);
	}

	@Override
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<AddressDTO> softDelete(Long id) {
		Address a = service.findById(id).orElse(null);
		
		if(a == null) {
			return new ResponseEntity<AddressDTO>(HttpStatus.NOT_FOUND);
		}
		
		this.service.softDelete(id);
		return new ResponseEntity<AddressDTO>(HttpStatus.OK);
	}
	
	
	
	
}
