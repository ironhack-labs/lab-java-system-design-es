package utils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
   public static DecimalFormat twoDecimal = new DecimalFormat("0.00");

   public static void showMessageIncorrectSelection() {
      System.out.println("¡Error! Some is wrong\nTry again: ");
   }

   public static void showMessageInElection() {
      System.out.println("Enter your choice: ");
   }

   public static void showMessageInData() {
      System.out.print("Enter the data: ");
   }

   public static void showInitMenu(String menuName, String[] menu) {
      System.out.println(menuName + " menu" );
      for (int i = 0; i < menu.length; i++) {
         System.out.println(i + ".- " + menu[i]);
      }
   }

   public static int retrieveNumberWithMessage() {
      //Excepción: InputMismatchException
      Utils.showMessageInElection();
      Scanner input = new Scanner(System.in);
      while (true) {
         try {
            return input.nextInt();
         } catch (InputMismatchException e) {
            showMessageIncorrectSelection();
         } finally {
            input.nextLine();
         }
      }
   }
   public static int retrieveNumberWithoutMessage() {
      //Excepción: InputMismatchException
      Scanner input = new Scanner(System.in);
      while (true) {
         try {
            return input.nextInt();
         } catch (InputMismatchException e) {
            showMessageIncorrectSelection();
         } finally {
            input.nextLine();
         }
      }
   }

   public static float retrieveFloatNumber() {
      //Excepción: InputMismatchException
      Scanner input = new Scanner(System.in);
      while (true) {
         try {
            return input.nextFloat();
         } catch (InputMismatchException e) {
            showMessageIncorrectSelection();
         } finally {
            input.nextLine();
         }
      }
   }

   public static boolean isOk() {
      Scanner input = new Scanner(System.in);
      System.out.println("¿Confirm your choice? (Y/N)");
      String confirmSelection = input.next();
      while (true) {
         if (confirmSelection.equals("Y") || confirmSelection.equals("y")) {
            System.out.println("Confirmed!");
            return true;
         } else if (confirmSelection.equals("n") || confirmSelection.equals("N")) {
            System.out.println("No confirmed");
            return false;
         } else {
            showMessageIncorrectSelection();
            confirmSelection = input.next();

         }
      }
   }

   public static boolean isYes() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Y/N:");
      String confirmSelection = input.next();
      while (true) {
         if (confirmSelection.equals("Y") || confirmSelection.equals("y")) {
            System.out.println("Ok");
            return true;
         } else if (confirmSelection.equals("n") || confirmSelection.equals("N")) {
            System.out.println("Ok");
            return false;
         } else {
            showMessageIncorrectSelection();
            confirmSelection = input.next();

         }
      }
   }

   public static void showFinalMessage() {
      System.out.println("Thank you for use program!");
   }

   public static int obteinHour() {
      long mSeconds = System.currentTimeMillis();
      return (int) (((mSeconds / 3600000) % 24) + 1);
   }

   public static boolean passwordIsCorrect(String realPassword) {
      int attemps = 2;
      System.out.println("Enter password, you have 3 tries:");
      for (int i = attemps; i >= 0; i--) {
         String passwordEntered = retrieveText();
         if (passwordEntered.equals(realPassword)) {
            System.out.println("Login OK");
            return true;
         } else {
            System.out.println("Incorrect password. Remaining attemps: " + i + ".");
         }
      }
      showMessageIncorrectSelection();
      return false;
   }

   public static String retrieveText() {
      Scanner input = new Scanner(System.in);
      return input.nextLine();
   }

   public static void showArrayList(ArrayList arrayListName) {
      for (int i = 0; i < arrayListName.size(); i++) {
         System.out.println(i + ".- " + arrayListName.get(i));
      }
   }

   public static boolean stringLengthIsOk(int maxLength, String wordToProve) {
      return wordToProve.length() <= maxLength;
   }

   public static String capitalize(String phrase) {
      if (phrase == null || phrase.length() == 0) {
         return "No válido vuelve a intentarlo";
      } else {
         char[] phraseChars = phrase.toCharArray();
         for (int i = 0; i < phraseChars.length - 1; i++) {
            if (phraseChars[i] == ' ') {
               phraseChars[i + 1] = Character.toUpperCase(phraseChars[i + 1]);
            }
         }
         return Character.toTitleCase(phrase.charAt(0)) + String.valueOf(phraseChars).substring(1);
      }
   }

   public static String newPassword(){
      System.out.println("Introduce una nueva contraseña");
      String password = Utils.retrieveText();
      while (true){
         System.out.println("Vuelve a introducir la contraseña");
         String passwordComprobation = Utils.retrieveText();
         if (password.equals(passwordComprobation)) {
            return password;
         }else {
            System.out.println("Contraseña incorrecta\nIntroduce una nueva contraseña:");
            password = Utils.retrieveText();
         }
      }
   }

   public static boolean boundArrayListComprobationIsOk(ArrayList arraylistName, int numValue){
      if (numValue < arraylistName.size() && numValue >=0){
         return true;
      }else {
         Utils.showMessageIncorrectSelection();
         return false;
      }

   }


   public static String loginNameOfUser(String firstName, String firstSurname){
      ArrayList<String> nameArray = new ArrayList<>();
      nameArray.add(firstName);
      nameArray.add(firstSurname);
      for (int i = 0; i < nameArray.size(); i++) {
         nameArray.set(i,nameArray.get(i).trim());
      }
      String login = nameArray.get(0).substring(0,2)+nameArray.get(1).substring(0,2);
      System.out.println(login);
      //Falta comprobación de longitud
   /*
      for (int i = 0; i < completeNameArray.length; i++) {
         if(completeNameArray[i].trim().isEmpty()){
            continue;
         }
         System.out.println(completeNameArray[i]);
      }

      if (completeNameArray.length ==2 ||completeNameArray.length ==3 ) {

      } else if (completeNameArray.length >= 4) {

      }
   */
      return login;
   }

}