package br.com.esmaelgoncalves.swaggersample.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.esmaelgoncalves.swaggersample.api.model.Usuario;
import br.com.esmaelgoncalves.swaggersample.api.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listarUsuarios(){
		List<Usuario> usuarios = repository.findAll();
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
	
}
