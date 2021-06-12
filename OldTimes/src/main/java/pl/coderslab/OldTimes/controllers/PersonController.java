package pl.coderslab.OldTimes.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.OldTimes.entity.Person;
import pl.coderslab.OldTimes.entity.House;
import pl.coderslab.OldTimes.entity.View;
import pl.coderslab.OldTimes.service.PersonService;

import java.util.Arrays;
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

        List<String> periodList = Arrays.asList("ancient", "middle-age", "renaissance");
        Model.addAttribute("periodList", periodList);

        List<String> socialStatus = Arrays.asList("poor", "medium", "rich");
        Model.addAttribute("socialStatusList", socialStatus);

        List<String> sex = Arrays.asList("man", "female", "nobody knows");
        Model.addAttribute("sexList", sex);



        return "add-person";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("personId") int theId,
                                    Model theModel) {

        Person thePerson = personService.findById(theId);

        theModel.addAttribute("person", thePerson);

        return "person-form";
    }


    @PostMapping("/save")
    public String savePerson(@ModelAttribute("person") Person thePerson) {

        personService.save(thePerson);

        return "redirect:/person/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("personID") int theId) {

        // delete
        personService.deleteById(theId);

        // redirect to
        return "redirect:/person/list";

    }

    @GetMapping("/showPerson")
    public String showPerson(@RequestParam("personId") int theId,
                             Model theModel) {

        Person thePerson = personService.findById(theId);

        theModel.addAttribute("person", thePerson);



        return "show-person";
    }

    @GetMapping("/showPersonHouse")
    public String showPersonHouse(@RequestParam("personId") int theId,
                                  Model theModel) {

        Person thePerson = personService.findById(theId);

        theModel.addAttribute("person", thePerson);
        House house = new House();
        theModel.addAttribute("house", house);


        return "show-person-house";
    }
    @GetMapping("/showPersonDescription")
    public String showPersonDescription(@RequestParam("personId") int theId,
                                  Model theModel) {



        Person thePerson = personService.findById(theId);

        theModel.addAttribute("person", thePerson);


        return "show-person-description";
    }

}



















