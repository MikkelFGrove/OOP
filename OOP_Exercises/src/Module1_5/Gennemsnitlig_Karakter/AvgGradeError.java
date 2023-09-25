package Module1_5.Gennemsnitlig_Karakter;

public class AvgGradeError {
    static int[] grades = {4, 7, 02, 00, 10, 4, 12};

    public static void main(String[] args) {
        double count = 0, sum = 0;
        for (int i = 0; i < grades.length; i++) {
            try {
                int x = getGrade(i);
                count += 1;
                sum += x;

            } catch (RuntimeException ex) {
            }
        }
        System.out.println(sum/count);
    }

    public static int getGrade(int courseid){
        int grade = grades[courseid];
        if (grade >= 2){
            return grade;
        } throw new RuntimeException("You did not pass WOMP WOMP");
    }
}
