package br.pucrs.engswii.beans;

public class DisciplineRegistrationReply {

    private String registrationStatus;
    private String description;
    private String classId;

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(String disciplineId) {
        this.disciplineId = disciplineId;
    }

    private String disciplineId;

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String setRegistrationStatus() {
        return registrationStatus;
    }
}
