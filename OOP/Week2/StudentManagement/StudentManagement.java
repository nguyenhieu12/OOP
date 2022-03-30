public class StudentManagement {
    /**
     * StudentExtends management.
     */
    public Student[] students = new Student[100];
    public int pos = 0;

    /**
     * compare group.
     */
    public boolean sameGroup(Student s1, Student s2) {
        return s1.equals(s2);
    }

    /**
     * add student into array.
     */
    public void addStudent(Student newStudentWeek2) {
        students[pos] = newStudentWeek2;
        pos++;
    }

    /**
     * print out info in order.
     */
    public String studentsByGroup() {
        boolean[] check = new boolean[pos];
        for (int i = 0; i < pos; i++) {
            check[i] = true;
        }
        String str = "";
        for (int i = 0; i < pos; i++) {
            if (check[i]) {
                check[i] = false;
                str = str + (students[i].getGroup() + "\n");
                str = str + (students[i].getInfo() + "\n");
                for (int j = i + 1; j < pos; j++) {
                    if (students[j].getGroup().equals(students[i].getGroup())) {
                        check[j] = false;
                        str = str + (students[j].getInfo() + "\n");
                    }
                }
            }
        }
        return str;
    }

    /**
     * remove student from array.
     */
    public void removeStudent(String id) {
        for (int k = 0; k < pos; k++) {
            if (students[k].getId().equals(id)) {
                for (int j = k; j < pos - 1; j++) {
                    students[j] = students[j + 1];
                }

            }

        }
        pos--;
    }

    /**
     * main function
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nguyen Van An");
        s.setId("17020001");
        s.setGroup("K62CC");
        s.setEmail("17020001@vnu.edu.vn");
    }

}
