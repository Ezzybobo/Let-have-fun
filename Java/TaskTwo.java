import java.util.Scanner;
public class TaskTwo {
public static void main (String [] args) {
Scanner input = new Scanner (System.in);

int sum= 0;
double average = 0;
for(int counter=1; counter<=10; counter++) {

System.out.print ("Enter 10 scores: ");
int score = input.nextInt();
if (score>=0&&score<= 100) {
sum += score;
average = (double) sum / 10;
}

else {
System.out.print("INVALID INPUT!!!");
}

}
System.out.println("Average = "+ average);
}
}
