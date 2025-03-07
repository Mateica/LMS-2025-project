package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.BaseService;

public abstract class BaseController<T, DTO> {
	@Autowired
	private BaseService<T> service;

	public BaseController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseController(BaseService<T> service) {
		super();
		this.service = service;
	}

	public BaseService<T> getService() {
		return service;
	}

	public void setService(BaseService<T> service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)	
	public ResponseEntity<Iterable<DTO>> findAll(){
		ArrayList<DTO> elements = new ArrayList<DTO>();
		
		for(T t : service.findAll()) {
			elements.add(new DTO(r.getBrojRacuna(),r.getStanje(),null,null));
		}
		
		return new ResponseEntity<Iterable<DTO>>(elements, HttpStatus.OK);
	};
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<DTO> findById(@PathVariable("id") Long id);
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<DTO> create(@RequestBody T t);
	
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<DTO> update(@RequestBody T t, @PathVariable("id") Long id);
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<DTO> delete(@PathVariable("id") Long id);

}
