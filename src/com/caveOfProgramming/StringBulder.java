package com.caveOfProgramming;
//String Bulder and String Formatting


import java.sql.SQLOutput;

public class StringBulder {

    public static void main(String[] args) {
        //Inefficient
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);
        // More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append("");
        sb.append(" I am lion tamer");
        System.out.println(sb.toString());
        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.")

                .append(" ")
                .append("I am skydiver.");
        System.out.println(s.toString());

//Formatting///
        System.out.print("Here is some text\tThat was a tab.\nThat was a newLine.");
        System.out.println("More text");
        //Formating intigers
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
        for (int i=0; i<20;i++){
            System.out.printf("%-2d: some text here\n", i);
            System.out.printf("%-2d: %s\n",i, " here is some text");
        }
  // formating floating point values
        System.out.printf("Total value: %f\n",5.6);
        System.out.printf("Total value: %.2f\n",5.6);
        System.out.printf("Total value: %.2f\n",5.676868);
        System.out.printf("Total value: %5.1f\n",343.6567667);
        System.out.printf("Total value: %-6.1f\n",343.6567667);
    }
}
