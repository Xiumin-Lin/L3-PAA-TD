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
                sumPromoAverage += oAverage;
                cptStudent++;
            }
        }
        return (cptStudent > 0) ? sumPromoAverage / cptStudent : -1;
    }

    /**
     * Return the overall average of a promotion.
     * If no students have a marked UE yet, -1 is returned.
     *
     * @param ue the EU for which you want to have an overall average
     * @return the overall average or -1 if there are not marked UE
     */
    public double getUEOverallAverage(UE ue) {
        double sumUEAverage = 0;
        int cptStudent = 0;
        for(Student student : promo) {
            double oUEAverage = student.getUeAverage(ue);
            if(oUEAverage >= 0) {
                sumUEAverage += oUEAverage;
                cptStudent++;
            }
        }
        return (cptStudent > 0) ? sumUEAverage / cptStudent : -1;
    }

    /**
     * Display the overall average per UE of the promotion
     */
    public void showOverallAveragePerUE() {
        StringBuilder sb = new StringBuilder();
        for(UE ue : UE.values()) {
            sb.append(ue.getLabel()).append(" : ").append(getUEOverallAverage(ue)).append(", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        System.out.println("Promotion Overall Average Per UE (" + sb + ')');
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

    /**
     * Display the valedictorian of the promo
     */
    public void showValedictorian() {
        StringBuilder sb = new StringBuilder();
        findValedictorian().forEach(student -> sb.append(student.getName()).append("; "));
        System.out.println("Promo Valedictorian(s) : " + sb);
    }

    /**
     * Find the valedictorian(s) (the best student(s)) for a specific EU
     *
     * @param ue the UE for which you want the best student
     * @return the list of valeditorian for the UE
     */
    public List<Student> findValedictorianPerUE(UE ue) {
        ArrayList<Student> valedictorians = new ArrayList<>();
        double bestAverage = 0;
        for(Student student : promo) {
            double studentAverage = student.getUeAverage(ue);
            if(studentAverage > bestAverage) {
                valedictorians.clear();
                valedictorians.add(student);
                bestAverage = studentAverage;
            } else if(studentAverage == bestAverage) valedictorians.add(student);
        }
        return valedictorians;
    }

    /**
     * Display the valedictorian per UE of the promo
     */
    public void showValedictorianPerUE() {
        StringBuilder sb = new StringBuilder();
        for(UE ue : UE.values()) {
            StringBuilder tmpSb = new StringBuilder();
            sb.append("\t").append(ue.getLabel()).append(": ");
            findValedictorianPerUE(ue).forEach(student -> tmpSb.append(student.getName()).append("; "));
            if(tmpSb.length() > 0) sb.append(tmpSb);
            else sb.append("Unknown;");
            sb.append("\n");
        }
        System.out.print("Promo Valedictorian(s) Per UE :\n " + sb);
    }

    @Override
    public String toString() {
        return "Promotion (" +
                "promo:\n" + promo + ')';
    }

    /**
     * Display all student averages per UE
     */
    public void showAllStudentAveragePerUE() {
        StringBuilder sb = new StringBuilder();
        promo.forEach(student -> sb.append("\t").append(student.showAveragePerUE()));
        sb.deleteCharAt(sb.lastIndexOf(","));
        System.out.println("Promotion (promo:\n" + sb + ')');
    }
}
