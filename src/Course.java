package CS193.src;

import java.io.*;

public class Course {
    // Store name of Course
    private String courseCode;
    private String courseName;
    private int credit;
    private Course[] prerequisite;

    // Construct a course
    public Course(String courseCode, String courseName, int credit, Course[] prerequisite) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.prerequisite = prerequisite;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public Course[] getPrerequisite() {
        return prerequisite;
    }

    @Override
    public String toString() {
        String listPrerequisite = "";

        if (prerequisite != null) {
            for (int i = 0; i < prerequisite.length; i++) {
                listPrerequisite += prerequisite[i].getCourseCode() + " ";
            }
        }

        String information = "";

        java.lang.System.out.println(new java.io.File("course.csv").getAbsolutePath());

        try {
            // Change your path in the pathfile below
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/vugiabao/Developer/Code/python-project/CS193/course.csv"));
            String line = "";

            while ((line = br.readLine()) != null) {
                if (line.equals(courseCode)) {

                    line = br.readLine();

                    String[] words = line.split(" ");
                    int count = 0;

                    for (int i = 0; i < words.length; i++) {
                        if (count < 15) {
                            information += words[i] + " ";
                            count++;
                        } else {
                            information += words[i] + "\n";
                            count = 0;
                        }
                    }
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ("⋆.˚ ─────────୨ৎ──────── ⋆.˚" + "\n"
                + "Course: " + courseCode + "\n"
                + "Content: " + courseName + "\n"
                + "Number of credit hours: " + credit + "\n"
                + "Information: " + information + "\n"
                + "List of prerequisites: " + listPrerequisite);
    }
}
