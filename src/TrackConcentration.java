package CS193.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class TrackConcentration {
    private String trackCode;
    private String trackName;
    private Object[] requiredCourse;
    private Object[] optionalCourse;
    private String[] listCourseCode = { "CGV", "CSE", "FCS", "DBIS", "MI", "SSW", "SWE", "PL", "Security" };

    public TrackConcentration(String trackCode, String trackName, Object[] requiredCourse, Object[] optionalCourse) {
        this.trackCode = trackCode;
        this.trackName = trackName;
        this.requiredCourse = requiredCourse;
        this.optionalCourse = optionalCourse;
    }

    @Override
    public String toString() {
        String information = "";
        String requireString = "";
        String optionalString = "";

        try {
            // Change your path in the pathfile below
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/vugiabao/Developer/Code/python-project/CS193/track.csv"));
            String line = "";

            while ((line = br.readLine()) != null) {
                if (line.equals(trackCode)) {

                    while ((line = br.readLine()) != null && !Arrays.asList(listCourseCode).contains(line)) {
                        information += line + "\n";
                    }

                }
            }

            br.close();

        } catch (Exception e) {

        }

        if (trackCode.equals("CGV")
                || trackCode.equals("MI")
                || trackCode.equals("SSW")
                || trackCode.equals("SWE")
                || trackCode.equals("Security")
                || trackCode.equals("PL")
                || trackCode.equals("CSE")
                || trackCode.equals("FCS")) {

            for (int i = 0; i < requiredCourse.length; i++) {
                if (i != requiredCourse.length - 1) {
                    if (requiredCourse[i] instanceof Course course) {
                        requireString += course.getCourseCode() + " and ";
                    } else if (requiredCourse[i] instanceof Object[] object) {
                        requireString += "(";
                        for (int j = 0; j < object.length - 1; j++) {
                            if (object[j] instanceof Course course) {
                                if (j != object.length - 2) {
                                    requireString += course.getCourseCode() + " or ";
                                } else {
                                    requireString += course.getCourseCode() + ") and ";
                                }
                            }
                        }
                    }
                } else {
                    if (requiredCourse[i] instanceof Course course) {
                        requireString += course.getCourseCode();
                    } else if (requiredCourse[i] instanceof Object[] object) {
                        requireString += "(";
                        for (int j = 0; j < object.length - 1; j++) {
                            if (object[j] instanceof Course course) {
                                if (j != object.length - 2) {
                                    requireString += course.getCourseCode() + " or ";
                                } else {
                                    requireString += course.getCourseCode() + ")";
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < optionalCourse.length; i++) {
                if (i != optionalCourse.length - 1) {
                    if (optionalCourse[i] instanceof Course course) {
                        optionalString += course.getCourseCode() + ", ";
                    } else if (optionalCourse[i] instanceof Object[] object) {
                        optionalString += "(";
                        int last = object.length - 1;
                        if (object[last].equals("and")) {
                            for (int j = 0; j < object.length - 1; j++) {
                                if (object[j] instanceof Course course) {
                                    if (j != object.length - 2) {
                                        optionalString += course.getCourseCode() + " and ";
                                    } else {
                                        optionalString += course.getCourseCode() + "), ";
                                    }
                                }
                            }
                        } else {
                            for (int j = 0; j < object.length - 1; j++) {
                                if (object[j] instanceof Course course) {
                                    if (j != object.length - 2) {
                                        optionalString += course.getCourseCode() + " or ";
                                    } else {
                                        optionalString += course.getCourseCode() + "), ";
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (optionalCourse[i] instanceof Course course) {
                        optionalString += course.getCourseCode();
                    } else if (optionalCourse[i] instanceof Object[] object) {
                        optionalString += "(";
                        int last = object.length - 1;
                        if (object[last].equals("and")) {
                            for (int j = 0; j < object.length - 1; j++) {
                                if (object[j] instanceof Course course) {
                                    if (j != object.length - 2) {
                                        optionalString += course.getCourseCode() + " and ";
                                    } else {
                                        optionalString += course.getCourseCode() + ")";
                                    }
                                }
                            }
                        } else {
                            for (int j = 0; j < object.length - 1; j++) {
                                if (object[j] instanceof Course course) {
                                    if (j != object.length - 2) {
                                        optionalString += course.getCourseCode() + " or ";
                                    } else {
                                        optionalString += course.getCourseCode() + ")";
                                    }
                                }
                            }
                        }
                    }
                }
            }

            return ("⋆.˚ ─────────୨ৎ──────── ⋆.˚" + "\n"
                    + "Track: " + trackName + " (" + trackCode + ")" + "\n"
                    + "Information: " + information + "\n"
                    + "Required courses: " + requireString + "\n"
                    + "Electives: " + optionalString);

        } else {
            return ("⋆.˚ ─────────୨ৎ──────── ⋆.˚" + "\n"
                    + "Track: " + trackName + " (" + trackCode + ")" + "\n"
                    + "Information: " + information + "\n"
                    + "Required courses: " + "CS 348 and CS 381 and CS 448 and (CS 373 or CS 473)" + "\n"
                    + "Electives: "
                    + "(CS 352 or CS 353 or CS 354) and (CS 355 or CS 426) and (CS 373 or CS 422 or CS 471 or CS 473 or CS 478 or CS 483)");

        }
    }

    public String getTrackCode() {
        return trackCode;
    }

    public String getTrackName() {
        return trackName;
    }

    public boolean checkEligibity(Course[] course) {
        boolean foundation = checkFoundation(course);

        if (foundation) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFoundation(Course[] course) {
        return true;
    }
}
