package br.pucrs.engswii.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class DisciplineRegistration {

    List<Discipline> disciplines;

    public DisciplineRegistration() {
        this.disciplines = new ArrayList<>();
    }

    public String add(Discipline discipline) {
        AtomicReference<String> response = new AtomicReference<>();
        disciplines.stream()
                .filter(d -> d.getDisciplineId().equalsIgnoreCase(discipline.getDisciplineId()))
                .findFirst()
                .ifPresentOrElse(i -> response.set("Insert un-successful"), () -> {
                    disciplines.add(discipline);
                    response.set("Insert successful");
                });
        return response.get();
    }
}
