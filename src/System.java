package CS193.src;

import java.util.ArrayList;

public class System {

    private ArrayList<Course> listCourses = new ArrayList<>();

    void main() {
        // _____________________________ Set Up _______________________________//
        /**
         * Course #0
         */
        listCourses.add(new Course("CS180", "Problem Solving And Object-Oriented Programming", 4, null));
        /**
         * Course #1
         */
        listCourses.add(new Course("CS182", "Foundations of Computer Science", 3,
                new Course[] { listCourses.get(0) }));
        /**
         * Course #2
         */
        listCourses.add(new Course("CS193", "Tools", 1, null));
        /**
         * Course #3
         */
        listCourses.add(new Course("CS240", "Programming in C", 3,
                new Course[] { listCourses.get(0) }));
        /**
         * Course #4
         */
        listCourses.add(new Course("CS250", "Computer Architecture", 4,
                new Course[] { listCourses.get(1), listCourses.get(3) }));
        /**
         * Course #5
         */
        listCourses.add(new Course("CS251", "Data Structures and Algorithm", 3,
                new Course[] { listCourses.get(1), listCourses.get(3) }));
        /**
         * Course #6
         */
        listCourses.add(new Course("CS252", "System Programming", 4,
                new Course[] { listCourses.get(4), listCourses.get(5) }));
        /**
         * Course #7
         */
        listCourses.add(new Course("CS243", "Artificial Intelligence Basics", 3,
                new Course[] { listCourses.get(0), listCourses.get(1) }));
        /**
         * Course #8
         */
        listCourses.add(new Course("CS38003", "Python Programming", 1,
                new Course[] { listCourses.get(0) }));
        /**
         * Course #9
         */
        listCourses.add(new Course("CS253", "Data Structures and Algorithm for DS/AI", 3,
                new Course[] { listCourses.get(0), listCourses.get(1), listCourses.get(8) }));
        /**
         * Course #10
         */
        listCourses.add(new Course("CS307", "Software Engineering I", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #11
         */
        listCourses.add(new Course("CS381", "Introduction To The Analysis Of Algorithms", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #12
         */
        listCourses.add(new Course("CS348", "Information Systems", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #13
         */
        listCourses.add(new Course("CS351", "Cloud Computing", 3,
                new Course[] { listCourses.get(6) }));
        /**
         * Course #14
         */
        listCourses.add(new Course("CS352", "Compilers: Principles And Practice", 3,
                new Course[] { listCourses.get(6) }));
        /**
         * Course #15
         */
        listCourses.add(new Course("CS353", "Principles Of Concurrency And Parallelism", 3,
                new Course[] { listCourses.get(14) }));
        /**
         * Course #16
         */
        listCourses.add(new Course("CS354", "Operating Systems", 3,
                new Course[] { listCourses.get(6) }));
        /**
         * Course #17
         */
        listCourses.add(new Course("CS355", "Introduction To Cryptography", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #18
         */
        listCourses.add(new Course("CS373", "Data Mining And Machine Learning", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #19
         */
        listCourses.add(new Course("CS38001", "C++ Programming", 3,
                new Course[] { listCourses.get(3) }));
        /**
         * Course #20
         */
        listCourses.add(new Course("CS38002", "Advanced Java Programming", 3,
                new Course[] { listCourses.get(0) }));
        /**
         * Course #21
         */
        listCourses.add(new Course("CS211", "Competitive Programming I", 2,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #22
         */
        listCourses.add(new Course("CS311", "Competitive Programming II", 2,
                new Course[] { listCourses.get(21) }));
        /**
         * Course #23
         */
        listCourses.add(new Course("CS411", "Competitive Programming III", 2,
                new Course[] { listCourses.get(22) }));
        /**
         * Course #24
         */
        listCourses.add(new Course("CS407", "Software Engineering Senior Project", 3,
                new Course[] { listCourses.get(10) }));
        /**
         * Course #25
         */
        listCourses.add(new Course("CS408", "Software Testing", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #26
         */
        listCourses.add(new Course("CS422", "Computer Networks", 3,
                new Course[] { listCourses.get(16) }));
        /**
         * Course #27
         */
        listCourses.add(new Course("CS426", "Computer Security", 3,
                new Course[] { listCourses.get(16) }));
        /**
         * Course #28
         */
        listCourses.add(new Course("CS334", "Fundamentals of Computer Graphics", 3,
                new Course[] { listCourses.get(3) }));
        /**
         * Course #29
         */
        listCourses.add(new Course("CS439", "Introduction To Data Visualization", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #30
         */
        listCourses.add(new Course("CS440", "Large Scale Data Analytics", 3,
                new Course[] { listCourses.get(18) }));
        /**
         * Course #31
         */
        listCourses.add(new Course("CS441", "Data Science Capstone", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #32
         */
        listCourses.add(new Course("CS448", "Introduction To Relational Database Systems", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #33
         */
        listCourses.add(new Course("CS456", "Programming Languages", 3,
                new Course[] { listCourses.get(14) }));
        /**
         * Course #34
         */
        listCourses.add(new Course("CS458", "Introduction To Robotics", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #35
         */
        listCourses.add(new Course("CS471", "Introduction To Artificial Intelligence", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #36
         */
        listCourses.add(new Course("CS473", "Web Information Search And Management", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #37
         */
        listCourses.add(new Course("CS475", "Human-Computer Interaction", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #38
         */
        listCourses.add(new Course("CS476", "Artificial Intelligence Capstone", 3,
                new Course[] { listCourses.get(5) }));
        /**
         * Course #39
         */
        listCourses.add(new Course("CS477", "Natural Language Processing", 3,
                new Course[] { listCourses.get(5), listCourses.get(18) }));
        /**
         * Course #40
         */
        listCourses.add(new Course("CS478", "Introduction To Bioinformatics", 3,
                new Course[] { listCourses.get(0) }));
        /**
         * Course #41
         */
        listCourses.add(new Course("CS483", "Introduction To The Theory Of Computation", 3,
                new Course[] { listCourses.get(11) }));
        /**
         * Course #42
         */
        listCourses.add(new Course("CS489", "Embedded Systems", 3,
                new Course[] { listCourses.get(6) }));
        /**
         * Course #43
         */
        listCourses.add(new Course("CS434", "Advanced Computer Graphics", 3,
                new Course[] { listCourses.get(28) }));
        /**
         * Course #44
         */
        listCourses.add(new Course("CS314", "Numerical Methods", 3,
                new Course[] { listCourses.get(0) }));

        // _____________________________ Information _______________________________//

        IO.println(
                "⋆.˚ ─────────୨ৎ──────── ⋆.˚Welcome to the Purdue University Computer Science⋆.˚ ─────────୨ৎ──────── ⋆.˚");
        IO.println(
                "To find information about Purdue CS courses, type in below the course code. The course code should be in the form CS###"
                        + "\n"
                        + "if the course has two ending 0s, and CS##### if the course does not have two ending 0s\n"
                        + "For each course, the prerequisite course need to have a grade of at least C to be registable\n"
                        + "To exit the system, type in Exit");

        String input = IO.readln("What course do you want to find information about today? ");

        while (!input.equals("Exit")) {
            IO.println(getInformation(input));
            input = IO.readln("What course do you want to find information about today? ");
        }
    }

    // This method return the information about the course after taking the input
    public String getInformation(String courseCode) {

        int coursePosition = -1;

        for (int i = 0; i < listCourses.size(); i++) {
            if (listCourses.get(i).getCourseCode().equals(courseCode)) {
                coursePosition = i;
                break;
            }
        }

        if (coursePosition == -1) {
            return ("Sorry, course " + courseCode + " does not exist. Please try another course.");
        } else {
            return listCourses.get(coursePosition).toString();
        }
    }
}
