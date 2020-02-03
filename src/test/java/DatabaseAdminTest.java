import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import java.awt.image.DataBuffer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dataAdmin;

    @Before
    public void before(){
        dataAdmin = new DatabaseAdmin("Yer man", "JX99999", 26000);
    }
    
    @Test
    public void canSetName(){
        dataAdmin.setName("Yer auld maw");
        assertEquals("Yer auld maw", dataAdmin.getName());
    }

    @Test
    public void canSetNI(){
        dataAdmin.setNi("JF99999");
        assertEquals("JF99999", dataAdmin.getNi());
    }

    @Test
    public void canSetSalary(){
        dataAdmin.setSalary(2);
        assertEquals(2, dataAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        dataAdmin.raiseSalary(0.02);
        assertEquals(26520, dataAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        dataAdmin.payBonus();
        assertEquals(26260, dataAdmin.getSalary(), 0.1);
    }



}
