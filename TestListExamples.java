import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {

  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals( "Test when left input is longer than right input.", expected, merged);
  }

  @Test
  public void testFilter() {
    List<String> toFilter = Arrays.asList("a" , "MOON" , "c" , "mOOn" , "e" );
    List<String> filteredExpected = Arrays.asList("MOON" , "mOOn" );
    List<String> filteredActual = ListExamples.filter( toFilter, (StringChecker) new IsMoon() );
    assertEquals( "Test filter method with moon in list.", filteredExpected, filteredActual );
  }
}
