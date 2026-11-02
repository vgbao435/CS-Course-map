package CS193.src;

public class Course {
    // Store name of Course
    private String courseName;
    private Course[] prerequisite;
    private String information;
    private int credits;

    // Construct a course
    public Course(String courseName, Course[] prerequisite, String information, int credits) {
        this.courseName = courseName;
        this.prerequisite = prerequisite;
        this.information = information;
        this.credits = credits;
    }

    // Find the shortest path to reach a course
    public Course[] findShortestPath(String course, int count, int creditTotal) {
        return new Course[1];
    }

}
