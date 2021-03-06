import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Yer auld da", "JX999999", 30000, "ballers");
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
        assertEquals(2, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.02);
        assertEquals(30600, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(30300, manager.getSalary(), 0.1);
    }

    @Test
    public void cantRaiseNegative(){
        manager.raiseSalary(-1);
        assertEquals(30000, manager.getSalary(), 0.1);
    }

    @Test
    public void cantGiveEmptyStringToChangeName(){
        manager.setName("");
        assertEquals("Yer auld da", manager.getName());
    }

    @Test
    public void cannotGiveNullName(){
        manager.setName(null);
        assertEquals("Yer auld da", manager.getName());
    }



}
