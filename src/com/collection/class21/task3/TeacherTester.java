package com.collection.class21.task3;

public class TeacherTester {
    public static void main(String[] args) {
        ChemTeacher chemTeacher=new ChemTeacher();
        chemTeacher.name="Michael";
        chemTeacher.teach();
        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.name="Sharif";
        pianoTeacher.teachPiano();
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Jamollidin";
        mathTeacher.teachMath();
        //Break till 1:05
    }
}
