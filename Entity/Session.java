package Entity;

import java.util.ArrayList;

public class Session {
    private String ID; // string or int
    private String startTime; // 'HH:MM'
    private String endTime; // 'HH:MM'
    private String semester; // fall, spring, summer, winter
    private String year; // string or int???
    private String day; // M T W TH F
    private Faculty instructor; // instructor
    private int roomNumber; // string or int?
    private String buildingName;
    private int limit; // occupancy limit
    private ArrayList<Student> students;
}
