public class Student {
        private String name;
        private int grade;

        // Constructor
        public Student(String name, int grade) {
            this.name = name;
            setGrade(grade); // Using setter to ensure validation
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for grade
        public int getGrade() {
            return grade;
        }

        // Setter for grading
        public void setGrade(int grade) {
            if (grade >= 0 && grade <= 100) {
                this.grade = grade;
            } else {
                this.grade = 0; // Default value when invalid
            }
        }

        // The main method to test the class
        public static void main(String[] args) {
            Student student1 = new Student("Denzel", 90);
            System.out.println("Student: " + student1.getName() + ", Grade: " + student1.getGrade());

            student1.setGrade(110); // Invalid grade, should be set to 0
            System.out.println("Updated Grade: " + student1.getGrade());
        }

}
