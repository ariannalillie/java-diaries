public class StudentMain {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Student s = new Student("s92300" + i,
                    switch (i) {
                        case 0 -> "Mary";
                        case 1 -> "Carol";
                        case 2 -> "Tim";
                        case 3 -> "Harry";
                        default -> "Anonymous";
                    },
                    "Java masterclass"
            );
            System.out.println(s);
        }
        Student recordStudentExample = new Student("39494", "Arianna", "Java Masterclass");
        System.out.println(recordStudentExample.name());
        System.out.println(recordStudentExample.classList());
    }
}
