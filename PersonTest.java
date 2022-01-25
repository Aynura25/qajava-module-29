import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
    public void PersonTest(int age) {
        boolean result = Person.isTeenager(19);
    }
    public static boolean isTeenager(int age)
    {
        boolean result;
        if (age < 19) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    @BeforeClass
   void BeforeClass(){
       System.out.println("Before class");
       isTeenager(20);
   }
   @AfterClass
    void AfterClass(){
        System.out.println("After class");
        isTeenager(19);
    }
    @Test
    void testIsTeenager(){
        boolean teenager = isTeenager(12);


        }

    }



    }
}
