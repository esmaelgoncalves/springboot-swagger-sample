package br.com.esmaelgoncalves.swaggersample.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.esmaelgoncalves.swaggersample.api.model.Status;
import br.com.esmaelgoncalves.swaggersample.api.service.StatusService;


@RestController
@RequestMapping("/status")
public class StatusResource {
	
	@Autowired
	private StatusService statusService;

	@GetMapping
	public ResponseEntity<Status> getStatus(){
		return new ResponseEntity<Status>(statusService.getStatus(), HttpStatus.OK);
	}
}
