package up.mi.td02.ex5;

import java.util.HashMap;

public class Student {

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

    /**
     * Return the average of a student in a UE.
     * If the student does not yet have enough marks in the UE, -1 is returned.
     *
     * @param ue the UE whose average you want to have
     * @return the average of a UE or -1 if there are not enough notes
     */
    public double getUeAverage(UE ue) {
        if(noteCC.get(ue) == null || noteExam.get(ue) == null) return -1;
        else return ((noteCC.get(ue) + noteExam.get(ue)) * ue.getCoeff()) / 2;
    }

    /**
     * Return the overall average of a student.
     * If the student has no UE marked yet, -1 is returned
     *
     * @return the overall average or -1 if there are not enough notes
     */
    public double getOverallAverage() {
        int cptUE = 0;
        double sumAverage = 0;
        for(UE ue : UE.values()) {
            double average = getUeAverage(ue);
            if(average >= 0) { // average < 0 means that the UE does not yet have all the scores
                sumAverage += average;
                cptUE++;
            }
        }
        return (cptUE > 0) ? sumAverage / cptUE : -1;
    }

    @Override
    public String toString() {
        return name + " (\n\tnoteCC: " + noteCC +
                "\n\tnoteExam:" + noteExam + ")\n";
    }

    /**
     * Return all the student's averages per UE.<br>
     * Ex : Ellie (moyenneUE: Algo=null, Prog=19.0, Maths=null, Reseau=null ),
     *
     * @return a string with all the student's averages per UE.
     */
    public String showAveragePerUE() {
        StringBuilder moyenneUE = new StringBuilder();
        for(UE ue : UE.values()) {
            moyenneUE.append(ue.getLabel()).append("=");
            if(noteCC.get(ue) == null || noteExam.get(ue) == null) moyenneUE.append("null");
            else moyenneUE.append(Math.max(noteExam.get(ue), getUeAverage(ue)));
            moyenneUE.append(", ");
        }
        moyenneUE.deleteCharAt(moyenneUE.lastIndexOf(","));
        return name + " (moyenneUE: " + moyenneUE + "),\n";
    }
}
