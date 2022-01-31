package com.prime.number;
import java.util.Scanner;

public class Main {
    static Scanner Myscanner = new Scanner(System.in);
    //BooksStore & BooksPrice Array [array declaration..]
   public static String[] BooksStore = {"Bangla" ,"English" , "MAthe" , "History" , "poemBooks" , "Programmimg in java"};
   public static  int[] BooksPrice = {100,  200, 300, 400, 500, 600};

   // Payment method......
    static void Payment (int BookPrice ,String Book){
        System.out.print("Pay Please ->");
        int CustomeraMoney = Myscanner.nextInt();

        if(CustomeraMoney == BookPrice){
            System.out.println("here is YOur Book " + Book + " Thanks for Shopping");
            System.out.println("THANKS FOR SHOPPING,HOPE YOU SEE NEXT TIME");
        }else if(CustomeraMoney < BookPrice){
            int LessMoney = BookPrice - CustomeraMoney;
            System.out.println("we can not accept less $ " + LessMoney);
        }else if(CustomeraMoney > BookPrice){
            int MoreMoney = CustomeraMoney - BookPrice;
            System.out.println("you paid more  $ " + MoreMoney);
        }else{
            GetErrorCondition("invalid Payment method");
        }
    }

    //BuyBooks Method...........
    static void BuyBooks(){
        System.out.println("Which Book You Want to Buy?");
        int CustomersWantsIndex = Myscanner.nextInt();

        if(CustomersWantsIndex >= BooksStore.length){
            GetErrorCondition("WE Do NOt HAve yOur Book");
        }else{
            String CustomresBooks = BooksStore[CustomersWantsIndex];
            int Bookprice = BooksPrice[CustomersWantsIndex];
            System.out.println("Your Book is " + CustomresBooks + " This Book is about $ " + Bookprice);
            Payment(Bookprice,CustomresBooks);
        }
    }

    //showBooks method........
    static void showBooks(){
        for(int counter = 0; counter< BooksStore.length; counter++){
            System.out.println("[" + counter + "] " + BooksStore[counter]);
        }

    }

    //GetInShop method..........
    static void GetInShop() {
        System.out.println("welcome to shop");
        System.out.println("Do YOU WAnt TO See Our Book List???(Y/N)");
        char WantTOSee = Myscanner.next().charAt(0);

        if(WantTOSee == 'y' || WantTOSee == 'Y'){
            showBooks();
            BuyBooks();
        }else if (WantTOSee == 'N' || WantTOSee == 'n') {
            GetOutShop();
        }else{
            GetErrorCondition("Invalid Input When Try to see book");
        }
    }

    //GetOutShop method.....
    static void GetOutShop(){
        System.out.println("Shop is closed!");
    }

    //GetErrorCondition method........
    static void GetErrorCondition(String Meassage){
        System.out.println(Meassage);
    }

    //This is main method...
    public static void main(String[] args) {
        System.out.println("WElcome into our Bookshelf");
        System.out.println("DO you want to get our book? (Y/N)");
        char WantToGetIn = Myscanner.next().charAt(0);

        if(WantToGetIn == 'Y'  ||  WantToGetIn == 'y' ){
            GetInShop();
        }else if (WantToGetIn == 'N' || WantToGetIn == 'n'){
            GetOutShop();
        }else{
            GetErrorCondition("Your Input is InValid!");
        }
    }

}
