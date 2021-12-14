package replit.Repl187a;
/*Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
**Expected Output:**
yo yolo
```*/

import java.util.ArrayList;

class Repl187 {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("hi");
        elements.add("yo");
        elements.add("sup");
        elements.add("yolo");
        elements.add("boop");

        elements.remove(4);
        elements.remove(2);
        elements.remove(0);
        for (String oneElement : elements) {
            System.out.print(oneElement+" ");
        }
    }
}