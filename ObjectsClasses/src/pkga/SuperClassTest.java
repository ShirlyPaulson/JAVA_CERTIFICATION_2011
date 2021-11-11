package pkga;

public class SuperClassTest {
    String text="hello";
    SuperClassTest() {}
    protected SuperClassTest(String text) {}
    protected void setText(String text) { this.text = text; }
    public String toString() {  return text;  }
}