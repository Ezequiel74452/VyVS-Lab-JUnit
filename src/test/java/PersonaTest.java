import org.example.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    private static final String NAME = "Ezequiel";
    private static final int INITIAL_AGE = 17;
    private final Persona persona = new Persona(NAME, INITIAL_AGE);

    @Test
    public void getNameTest() {
        String result = persona.getName();
        assertEquals(NAME, result);
    }

    @Test
    public void getAgeTest() {
        int result = persona.getAge();
        assertEquals(INITIAL_AGE, result);
    }

    @Test
    public void birthdayTest() {
        int actual_age = persona.getAge();
        persona.birthday();
        int result = persona.getAge();
        assertEquals(actual_age+1, result);
    }

    @Test
    public void setValidAgeTest() {
        int actual_age = 5;
        persona.setAge(actual_age);
        int result = persona.getAge();
        assertEquals(actual_age, result);
    }

    @Test
    public void setInvalidAgeTest() {
        persona.setAge(-5);
        int result = persona.getAge();
        assertEquals(0, result);
    }

    @Test
    public void isNotAdultTest() {
        int actual_age = 17;
        persona.setAge(actual_age);
        boolean result = persona.isAdult();
        assertFalse(result);
    }

    @Test
    public void isAdultTest() {
        int actual_age = 18;
        persona.setAge(actual_age);
        boolean result = persona.isAdult();
        assertTrue(result);
    }

}