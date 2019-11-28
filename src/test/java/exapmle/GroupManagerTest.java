package exapmle;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GroupManagerTest {

    @org.junit.Test
    public void getGroupStudentCount() {
        Group group =createTestGroup(6);
        int result=new GroupManager().getGroupStudentCount(group);
            assertEquals(6,result);
    }

    private Group createTestGroup(int StudentCount) {
        Group group =new Group();
        List<User> students= new ArrayList<User>();

        for(int i=0; i<StudentCount;i++){
            students.add(new User("fdf", "dfdf", 1990,1,true));
        }
        group.setStudents(students);
        return group;
    }

    @org.junit.Test
    public void getBudgetStudentCount1() {
    }
}