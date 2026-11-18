import java.util.Scanner;
public class TaskFour {
public static void main (String [] args) {
Scanner input = new Scanner (System.in);

int sum= 0;
for(int counter=1; counter<=10; counter++) {

System.out.print ("Enter 10 scores: ");
int score = input.nextInt();
if (score>=0&&score<= 100&&counter%2==0) {
sum += score;
}
}
System.out.println("Sum = "+ sum);
}
}
