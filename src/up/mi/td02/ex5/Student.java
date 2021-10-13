package up.mi.td02.ex5;

import java.util.HashMap;

public class Student {
    public static final String cc = "cc";
    public static final String exam = "exam";

    private String name;
    private HashMap<UE, Double> noteCC;
    private HashMap<UE, Double> noteExam;

    public Student(String name) {
        this.name = name;
        this.noteCC = new HashMap<>();
        this.noteExam = new HashMap<>();
        for(UE ue : UE.values()) {
            noteCC.put(ue, null);
            noteExam.put(ue, null);
        }
    }

    public void addNoteCC(UE ue, double note) {
        noteCC.put(ue, note);
    }

    public void addNoteExam(UE ue, double note) {
        noteExam.put(ue, note);
    }

}
