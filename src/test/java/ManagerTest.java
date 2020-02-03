import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Yer auld da", "JX999999", 30000);
    }

    @Test
    public void canSetDepartment(){
        manager.setDeptName("Electronics");
        assertEquals("Electronics", manager.getDeptName());
    }

    @Test
    public void canSetName(){
        manager.setName("Yer auld maw");
        assertEquals("Yer auld maw", manager.getName());
    }

    @Test
    public void canSetNI(){
        manager.setNi("JF99999");
        assertEquals("JF99999", manager.getNi());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(2);
        assertEquals(2, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.02);
        assertEquals(30600, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(30300, manager.getSalary());
    }


}
