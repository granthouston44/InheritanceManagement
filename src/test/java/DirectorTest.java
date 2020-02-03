import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;


    @Before
    public void before(){
        director = new Director("Yer auld da's da", "JX999999", 100000, "ballers", 5000);
    }

    @Test
    public void canSetDepartment(){
        director.setDeptName("Electronics");
        assertEquals("Electronics", director.getDeptName());
    }

    @Test
    public void canSetName(){
        director.setName("Yer auld maw");
        assertEquals("Yer auld maw", director.getName());
    }

    @Test
    public void canSetNI(){
        director.setNi("JF99999");
        assertEquals("JF99999", director.getNi());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(2);
        assertEquals(2, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.02);
        assertEquals(102000, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(102000, director.getSalary(), 0.1);
    }

    @Test
    public void canChangeBudget(){
        director.setBudget(10);
        assertEquals(10, director.getBudget(), 0.0001);
    }


}
