package Entity;

import java.util.ArrayList;

public class Student {
    private String ID; // string or int
    private char tuitionStatus; // if tuition is paid, 'Y', else, 'N'
    private String major;
    private ArrayList<Session> sessions;
}
