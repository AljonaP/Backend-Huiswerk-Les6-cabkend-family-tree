import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person test;
    @BeforeEach
    public void init(){
        test = new Person("Barbra", "Streisend", "female", 88 );

    }
    @Test
    public void getName(){
        // arrange
        test = new Person("Barbra", "Streisend", "female", 88 );

        // Act
        String result = test.getName();

        // Assert
        Assertions.assertEquals("Barbra", result);
    }

    @Test
    public void getFather(){
        //arrange
        test = new Person("Barbra", "Streisend", "female", 88 );
        Person testFather = new Person("Piet", "Jansen", "male", 40);
        test.setFather(testFather);

        //act
        Person result = test.getFather();

        //assert
        Assertions.assertEquals(testFather, result);
    }
}
