package br.pucrs.engswii.controllers;

import br.pucrs.engswii.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discipline")
public class DisciplineRegistrationController {

    @Autowired private DisciplineRegistration disciplineRegistration;

    @PostMapping
    public DisciplineRegistrationReply registerDiscipline(@RequestBody Discipline discipline) {
        System.out.println("In registerDiscipline");

        String response = disciplineRegistration.add(discipline);

        DisciplineRegistrationReply reply = new DisciplineRegistrationReply();
        reply.setDisciplineId(discipline.getDisciplineId());
        reply.setClassId(discipline.getClassId());
        reply.setDescription(discipline.getDescription());
        reply.setRegistrationStatus(response);

        return reply;
    }
}
