package annotations.suppress_unchecked_warnings;

import java.util.ArrayList;

public class SuppressUncheckedWarningExample {

    @SuppressWarnings("unchecked") // Suppresses the unchecked warning
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // No generics used (raw type)

        list.add("Hello");
        list.add(123); // Mixing types (not recommended)

        System.out.println("ArrayList contents: " + list);
    }
}
