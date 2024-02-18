import gunAssignment.Gun;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GunTest {
    @Test
    public void testThatAGunExist(){
        Gun gun = new Gun();
        assertNotNull(gun);
    }
    @Test
    public void testTheNameOfTheGun(){
        Gun gun = new Gun();
        gun.hasName();
        assertEquals("6-roundsSilencer",gun.hasName());
    }
    @Test
    public void testTheGun_Model(){
        Gun gun = new Gun();
        gun.hasModel();
        assertEquals("AK47Call991",gun.hasModel());
    }
    @Test
    public void testThatGunIsCocked(){
        Gun gun = new Gun();
        gun.isCocked();
        assertFalse(gun.isCocked());
        gun.cocked();
        assertTrue(gun.cocked());
    }
    @Test
    public void testThatThatWeCanAddBullets(){
        Gun gun = new Gun();
        gun.addBullets();
        assertEquals(1,gun.addBullets());
    }
    @Test
    public void testThatWeCanAdd_ThreeBullets(){
        Gun gun = new Gun();
        gun.addBullets();
        gun.addBullets();
        gun.addBullets();
        assertEquals(3,gun.addBullets());
    }
    @Test
    public void testThatThatTheGunCanShoot(){
        Gun gun = new Gun();
        gun.addBullets();
        gun.addBullets();
        gun.shoot();
        assertEquals(1,gun.shoot());

    }


}
