package up.mi.td02.ex5;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Return the overall average of a promotion.
     * If no students have a marked UE yet, -1 is returned.
     *
     * @return the overall average or -1 if there are not marked UE
     */
    public double getOverallAverage() {
        double sumPromoAverage = 0;
        int cptStudent = 0;
        for(Student student : promo) {
            double oAverage = student.getOverallAverage();
            if(oAverage >= 0) {
                sumPromoAverage += student.getOverallAverage();
                cptStudent++;
            }
        }
        return (cptStudent > 0) ? sumPromoAverage / cptStudent : -1;
    }

    /**
     * Find the valedictorian(s) (the best student(s)) of the promo
     *
     * @return the list of valeditorian
     */
    public List<Student> findValedictorian() {
        ArrayList<Student> valedictorians = new ArrayList<>();
        double bestAverage = 0;
        for(Student student : promo) {
            double studentAverage = student.getOverallAverage();
            if(studentAverage > bestAverage) {
                valedictorians.clear();
                valedictorians.add(student);
                bestAverage = studentAverage;
            } else if(studentAverage == bestAverage) valedictorians.add(student);
        }
        return valedictorians;
    }

    @Override
    public String toString() {
        return "Promotion (" +
                "promo:\n" + promo + ')';
    }

    /**
     * Return all student averages per UE in a String.
     *
     * @return a string with all students averages per UE.
     */
    public String showAllStudentAveragePerUE() {
        StringBuilder sb = new StringBuilder();
        promo.forEach(student -> sb.append("\t").append(student.showAveragePerUE()));
        sb.deleteCharAt(sb.lastIndexOf(","));
        return "Promotion (" +
                "promo:\n" + sb + ')';
    }
}
