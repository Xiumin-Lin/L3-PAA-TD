package up.mi.td02.ex5;

import java.util.ArrayList;

public class Promotion {
    private final ArrayList<Student> promo;

    public Promotion() {
        promo = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if(!promo.contains(s)) promo.add(s);
    }

    public void addNoteCC(Student s, UE ue, double note) {
        s.addNoteCC(ue, note);
    }

    public void addNoteExam(Student s, UE ue, double note) {
        s.addNoteExam(ue, note);
    }

}
