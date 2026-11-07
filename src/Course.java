package CS193.src;

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

        return ("⋆.˚ ─────────୨ৎ──────── ⋆.˚" + "\n"
                + "Course: " + courseCode + "\n"
                + "Content: " + courseName + "\n"
                + "Number of credit hours: " + credit + "\n"
                + "List of prerequisites: " + listPrerequisite);
    }
}
