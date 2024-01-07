package com.company;

import java.util.Scanner;

class library{  
    String books[];
    int no_of_books;
    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books ++;
        System.out.println(book + " has been added");
    }
    void issuebook(String book2){
        for(int i =0; i< this.books.length ; i++){
            if(this.books[i].equals(book2)){
                System.out.println("this book has been issued : ");
                this.books[i] = null;
                return;
            }
            System.out.println("* " + book2);
        }
        System.out.println("this book is not available in library");

    }
    void returnbook(String book){
        addbook(book);
    }
    void showavailablebook(){
        System.out.println("available books are : ");
        for(String element : this.books){
            if(element == null){
                continue;
            }
            System.out.print("* ");
            System.out.println(element);
        }
    }
}
public class exe12_pp01_testLibrary {
    public static void main(String[] args) {
        library l1 = new library();
        l1.addbook("13 reasons why");
        l1.addbook("algorithms");
        l1.addbook("c++");
        l1.showavailablebook();
        l1.issuebook("c++");
        l1.showavailablebook();

        l1.returnbook("c++");
        l1.showavailablebook();
    
    }
    
}
