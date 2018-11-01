package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public String getName() {
        return name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public int getKnowledge() {
        return knowledge.getMark();
    }
}
