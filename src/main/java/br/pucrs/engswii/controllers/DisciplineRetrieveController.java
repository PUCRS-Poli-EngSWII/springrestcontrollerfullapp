package br.pucrs.engswii.controllers;

import br.pucrs.engswii.beans.Discipline;
import br.pucrs.engswii.beans.DisciplineRegistration;
import br.pucrs.engswii.beans.DisciplineRegistrationReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discipline")
public class DisciplineRetrieveController {

    @Autowired private DisciplineRegistration disciplineRegistration;

    @GetMapping
    public List<Discipline> registerDiscipline() {
        System.out.println("In retrieveDiscipline");
        return disciplineRegistration.getDisciplines();
    }
}
