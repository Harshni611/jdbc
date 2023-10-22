package com.example.demo.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Travelentity;
import com.example.demo.Repository.Travelrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
public class Travelcontroller {
	
	@Autowired
	public Travelrepository repo;
	@PostMapping("/addtravel")
	public Travelentity adduser(@RequestBody Travelentity travel) {
		try {
			repo.save(travel);
			return travel;
		}
		catch (Exception e) {
			e.printStackTrace();
	}return null;
}
	
@GetMapping("/gettravel")
public List<Travelentity> getuser() {
	try {
		return repo.findAll();
	}
	catch (Exception e) {
		e.printStackTrace();
}return null;
}

@GetMapping("/gettravel/{id}")
public Travelentity getTravelById(@PathVariable int id) {
    return repo.findById(id).orElse(null);
}


@PutMapping("/updatetravel")
public Travelentity updateuser(@RequestBody Travelentity travel) {
	try {
		repo.save(travel);
		return travel;
	}
	catch (Exception e) {
		e.printStackTrace();
}return null;
}

@DeleteMapping("/deletetravel/{id}")
public String deluser(@PathVariable int id) {
	@SuppressWarnings("deprecation")
	Travelentity travel = repo.getOne(id);
	repo.delete(travel);
	return "travel details deleted";
}
}