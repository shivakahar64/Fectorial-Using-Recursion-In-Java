

/*
        Fectorial :
        ------------  Fectorial Means Dicrement Of Any Entered "INTEGER" Number, Where Multiplication Of All The Previous Values Is "FECTORIAL NUMBER".
                      Suppose We Have Entered : 5
                      So It Means All The Previous Values Of 5,
                      Like This 5, 4, 3, 2, 1. Now After Multiplication Of All These Values,
                      Like 5 * 4 * 3 * 2 * 1 = 120.
                      This Is The Final Answer, Fectorial Of 5 Is 120.
                      --------------------------------------------------------------------------------------------------

                      Enter A Number To Check It's Fectorial : 7
                      The Fectorial Of 7 Is : 5040

                      Enter A Number To Check It's Fectorial : 5
                      The Fectorial Of 5 Is : 120

                      Enter A Number To Check It's Fectorial : 1
                      The Fectorial Of 1 Is : 1

                      Enter A Number To Check It's Fectorial : 0
                      The Fectorial Of 1 Is : 1

                      In Both Conditions, If We Entered "1" Or "0". The Answer Will Should Be "1".

         Recursion :
         -----------  Recusrtion Means A Function Is Calling By Itself In A Method(Function).
 */


import java.util.Scanner;                                                                   // We Are Using "Scanner Class" From Extranal Libraries.

public class Fectorial{                                                                     // It Is A Public Class "Fectorial" Which Is Same As File Name.

    public static int Fectorial(int Number)                                                 // Static Type Method(Function) With One "INT" Type Argument.
    {
        if(Number == 0 || Number == 1)                                                      // "If Condition" Where We Are Menually Giving Values Using "Double Equal" or "Logical OR Operator".
        {
            return 1;                                                                       // "Return" Statement Returning "1" Value When User Will Give "0" Or "1".
        }
        else                                                                                // Else Statement
        {
            return (Number * Fectorial(Number - 1));                                // Main Logic For Check Fectorial
        }
    }

    public static void main(String[] args)                                                  // Main Method(Function) Program Will Execute From Here.
    {
        Scanner ST = new Scanner(System.in);                                                // "Scanner Class" Creating "ST" Object Using "new" Keyword.
        int Number;                                                                         // Initialing "INT" Type Numeric Variable.
        System.out.print("Enter A Number To Check It's Fectorial : ");                      // Console Print Statement
        Number = ST.nextInt();                                                              // Taking Input From Users Using "ST" Object.
        System.out.println("-----------------------------------------------");              // Console Print Statement.
        System.out.println("The Fectorial Of "+Number+" Is : "+Fectorial(Number));          // Console Print Statement, Giving Referance From Here To Fectorial Method(Function).
    }
}
