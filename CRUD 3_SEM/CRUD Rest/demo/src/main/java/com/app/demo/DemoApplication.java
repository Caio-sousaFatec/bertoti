package com.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@CrossOrigin(origins = { "http://localhost:8080", "http://127.0.0.1:5500" })
	@RestController
	@RequestMapping("/motos")
	public class DemoApplicationController {

		private List<Moto> motos = new ArrayList<>();

		public DemoApplicationController() {
			motos.addAll(List.of(
					new Moto("cbx 250"),
					new Moto("cb 500"),
					new Moto("cb 1000"),
					new Moto("Lander 250"),
					new Moto("XRE 300")));

		}

		@GetMapping("/getMotos")
		Iterable<Moto> getMotos() {
			return motos;
		}

		@GetMapping("/{id}")
		Optional<Moto> getMotoById(@PathVariable String id) {
			for (Moto c : motos) {
				if (c.getId().equals(id)) {
					return Optional.of(c);
				}
			}

			return Optional.empty();
		}

		@PostMapping("/")
		ResponseEntity<Moto> postName(@RequestBody String name) {
			Moto moto = new Moto(name);
			motos.add(moto);
			return new ResponseEntity<>(moto, HttpStatus.CREATED);
		}

		ResponseEntity<Moto> postMoto(@RequestBody Moto moto) {
			motos.add(moto);
			return new ResponseEntity<>(moto, HttpStatus.CREATED);
		}

		@PutMapping("/{id}")
		public ResponseEntity<Moto> putMethodName(@PathVariable String id, @RequestBody Moto moto) {
			if (moto == null || id == null || motos == null) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}

			for (int i = 0; i < motos.size(); i++) {
				if (motos.get(i).getId().equals(id)) {
					motos.set(i, moto);
					return new ResponseEntity<>(moto, HttpStatus.OK);
				}
			}

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		@DeleteMapping("/{id}")
		void deleteCoffee(@PathVariable String id) {
			motos.removeIf(m -> m.getId().equals(id));
		}
	}

	static class Moto {
		private String id;
		private String name;

		public Moto() {
		}

		public Moto(String name) {
			this.id = UUID.randomUUID().toString();
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Controller
	public class WebPageController {

		@GetMapping("/home")
		public ModelAndView homepage() {

			return new ModelAndView("home");
		}
	}

}
