package Entity;

import java.util.ArrayList;

public class Course {
    private String ID; // course id. String or int?
    private String name; // course name
    private ArrayList<Course> prerequisite; // prereq of the course
}
