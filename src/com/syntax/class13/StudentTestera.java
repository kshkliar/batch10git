package com.syntax.class13;

public class StudentTestera {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Studenta Kosta = new Studenta();
        Kosta.name = "Konstantin";
        Kosta.id = "7";
        Kosta.gender = 'M';
        Kosta.tutition = 1250;
        Kosta.school="Syntax";
        Kosta.currency='$';
        Kosta.study();
        Kosta.payForTuition();
    }

}
