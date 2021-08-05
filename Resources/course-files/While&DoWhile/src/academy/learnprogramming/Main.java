package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //  WHILE
        // this will not execute since the condition is always false
	    int count = 6;
	    while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

	    for(int i=6; i != 6; i++){
            System.out.println("Count value is " + count);
        }

	    //DO WHILE
        // Do while will always get executed one (if count = 6 => infinite loop)
        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100){  // will break the infinite loop
                break;
            }
        } while (count != 6);
    }
}
