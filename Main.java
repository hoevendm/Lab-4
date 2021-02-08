//Importing Random Util
import java.util.Random;

class Main {
  //assigning random Variable
  public static void main(String[] args) {
  Random r = new Random();
  int randomNum = r.nextInt(50) + 1;  
    System.out.println("The Random number is: " + randomNum);
  
  //Creating substitute variable
  int countdown = randomNum;

  // Countdown from Random Number Input
  for (countdown = randomNum; countdown>=0; countdown--) {
      System.out.println(countdown);
    }
  // If/else statement specifying different print messages  
  if (randomNum <= 5){
    System.out.println("Ahoy mateys!");
  }
  else if (randomNum > 25 && randomNum < 42) {
    System.out.println("Cannonball!");
  }
  else{
    System.out.println("Blast Off!");
    }
  }
} 