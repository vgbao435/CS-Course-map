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

        // _____________________________ Giving information part, asking from input
        // _______________________________//

        IO.println(
                "⋆.˚ ─────────୨ৎ──────── ⋆.˚Welcome to the Purdue University Computer Science⋆.˚ ─────────୨ৎ──────── ⋆.˚");
        IO.println(
                "To find information about Purdue CS courses, type in below the course code. The course code should be in the form CS###"
                        + "\n"
                        + "if the course has two ending 0s, and CS##### if the course does not have two ending 0s\n"
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
