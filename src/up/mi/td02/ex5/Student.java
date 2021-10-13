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

    @Override
    public String toString() {
        return name + " (\n\tnoteCC: " + noteCC +
                "\n\tnoteExam:" + noteExam + ")\n";
    }

    public String showMoyenne() {
        StringBuilder moyenneUE = new StringBuilder();
        for(UE ue : UE.values()) {
            moyenneUE.append(ue.getLabel()).append("=");
            if(noteCC.get(ue) == null || noteExam.get(ue) == null) moyenneUE.append("null");
            else moyenneUE.append(Math.max(noteExam.get(ue), (noteCC.get(ue) + noteExam.get(ue)) / 2));
            moyenneUE.append(", ");
        }
        moyenneUE.deleteCharAt(moyenneUE.lastIndexOf(","));
        return name + " (moyenneUE: " + moyenneUE +  "),\n";
    }
}
