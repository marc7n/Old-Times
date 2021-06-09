package pl.coderslab.OldTimes.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.OldTimes.entity.Person;
import pl.coderslab.OldTimes.service.PersonService;

import java.util.List;


@Controller
@RequestMapping("/person")
public class PersonController {

	private PersonService personService;

	public PersonController(PersonService thePersonService) {
		personService = thePersonService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listPerson(Model model) {
		Person person = new Person();
		model.addAttribute("person", person);
		// get  from db
		List<Person> thePersons = personService.findAll();
		
		// add to the spring model
		model.addAttribute("persons", thePersons);
		
		return "list-person";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model Model) {
		
		// create model attribute to bind form data
		Person thePerson = new Person();
		
		Model.addAttribute("person", thePerson);
		
		return "add-person";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("personId") int theId,
									Model theModel) {
		
		// get the employee from the service
		Person thePerson = personService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("person", thePerson);
		
		// send over to our form
		return "person/person-form";
	}
	
	
	@PostMapping("/save")
	public String savePerson(@ModelAttribute("person") Person thePerson) {
		
		// save the employee
		personService.save(thePerson);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/person/list";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("personID") int theId) {
		
		// delete the employee
		personService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/person/list";
		
	}

}



















