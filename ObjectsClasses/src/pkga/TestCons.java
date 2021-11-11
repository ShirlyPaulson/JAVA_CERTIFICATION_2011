package pkga;

import pkga.SuperClassTest;

public class TestCons extends SuperClassTest {  // Line 1
    private String text;   // Line 2
    TestCons(String text ) {   //Line 3
        setText(text);
    }
    public void setText(String text) { this.text = text; }

    public static void main(String[] args) {
        System.out.println(new TestCons("text"));  // Line 4
    }
}