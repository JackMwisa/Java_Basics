package Day18;


/*
    1- Create "Class" interface which will have takeAttendance and getAttendanceList functions.
    implement that interface from 2 class which called "Math" and "Italian". write test cases.
 */

import java.util.ArrayList;
import java.util.List;

public interface Class {
    void takeAttendance(String name);
    List<String> getAttendanceList();
}

class Math implements Class {
    List<String> attendanceList;

    public Math() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(String name) {
        attendanceList.add(name);
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(String name) {
        attendanceList.add(name);
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

