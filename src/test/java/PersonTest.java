import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    Person test;
    @BeforeEach
    public void init(){
        test = new Person("Barbra", "Streisend", "female", 88 );

    }
    @Test
    public void getName(){
        // Arrange
        Person test = new Person("Barbra", "Streisend", "female", 88 );

        // Act
        String result = test.getName();

        // Assert
        Assertions.assertEquals("Barbra", result);
    }

    @Test
    public void getFather(){
        // Arrange
        Person testFather = new Person("Piet", "Jansen", "male", 58);
        test.setFather(testFather);

        // Act
        Person result = test.getFather();

        // Assert
        Assertions.assertEquals(testFather, result);
        }

        @Test
    public void getMother(){
        // Arrange
        Person testMother = new Person("Anne", "Jansen", "female", 56);
        test.setMother(testMother);

        // Act
        Person result = test.getMother();

        // Assert
        Assertions.assertEquals(testMother, result);
        }

        //lijst pets

    @Test
    public void getSiblings() {
        // Arrange

        List<Person> testListParents = new ArrayList<>();
        Person testFather = new Person("Piet", "Jansen", "male", 58);
        Person testMother = new Person("Anne", "Jansen", "female", 56);
        testListParents.add(testFather);
        testListParents.add(testMother);

        List<Person> testListSiblings = new ArrayList<>();
        Person sibling1 = new Person("Henk", "Jansen", "male", 56);
        Person sibling2 = new Person("Frans", "Jansen", "male", 53);
        Person sibling3 = new Person("Mike", "Potters", "male", 49);
        testListSiblings.add(sibling1);
        testListSiblings.add(sibling2);
        testListSiblings.add(sibling3);


        testFather.addSibling(sibling2);
        testMother.addSibling(sibling1);
        testMother.addSibling(sibling3);

        test.setSiblings(testListSiblings);

        // Act
        List<Person> result = test.getSiblings();

        // Assert
        Assertions.assertEquals(testListSiblings, result);
    }

//    public void getGrandchildren() {
//        // Arrange
//        List<Person> testListChildren = new ArrayList<>();
//        Person child1 = new Person("Henk", "Jansen", "male", 34);
//        Person child2 = new Person("Marie", "Jansen", "female", 38);
//        Person child3 = new Person("Roel", "Jansen", "male", 30);
//        testListChildren.add(child1);
//        testListChildren.add(child2);
//        testListChildren.add(child3);
//
//        List<Person> testListGrandChildren = new ArrayList<>();
//        Person grandChild1 = new Person("Kelly", "van den Berg", "female", 14);
//        Person grandChild2 = new Person("Lars", "Jansen", "female", 14);
//        Person grandChild3 = new Person("Jo", "Jansen", "male", 10);
//        testListGrandChildren.add(grandChild1);
//        testListGrandChildren.add(grandChild2);
//        testListGrandChildren.add(grandChild3);
//
//        child1.addChild(grandChild1);
//        child1.addChild(grandChild2);
//        child3.addChild(grandChild3);
//
//
//        test.setChildren(testListChildren);
//
//        // Act
//        List<Person> result = test.getGrandchildren();
//
//        // Assert
//        Assertions.assertEquals(testListGrandChildren, result);

    @Test
    public void getChildren() {
        // Arrange
        List<Person> testListChildren = new ArrayList<>();
        Person child1 = new Person("Henk", "Jansen", "male", 34);
        Person child2 = new Person("Marie", "Jansen", "female", 38);
        Person child3 = new Person("Roel", "Jansen", "male", 30);
        testListChildren.add(child1);
        testListChildren.add(child2);
        testListChildren.add(child3);
        test.setChildren(testListChildren);

        // Act
        List<Person> result = test.getChildren();

        // Assert
        Assertions.assertEquals(testListChildren, result);
    }

    @Test
    public void getGrandchildren() {
        // Arrange
        List<Person> testListChildren = new ArrayList<>();
        Person child1 = new Person("Henk", "Jansen", "male", 34);
        Person child2 = new Person("Marie", "Jansen", "female", 38);
        Person child3 = new Person("Roel", "Jansen", "male", 30);
        testListChildren.add(child1);
        testListChildren.add(child2);
        testListChildren.add(child3);

        List<Person> testListGrandChildren = new ArrayList<>();
        Person grandChild1 = new Person("Kelly", "van den Berg", "female", 14);
        Person grandChild2 = new Person("Lars", "Jansen", "female", 14);
        Person grandChild3 = new Person("Jo", "Jansen", "male", 10);
        testListGrandChildren.add(grandChild1);
        testListGrandChildren.add(grandChild2);
        testListGrandChildren.add(grandChild3);

        child1.addChild(grandChild1);
        child1.addChild(grandChild2);
        child3.addChild(grandChild3);

        test.setChildren(testListChildren);

        // Act
        List<Person> result = test.getGrandchildren();

        // Assert
        Assertions.assertEquals(testListGrandChildren, result);
    }
}


