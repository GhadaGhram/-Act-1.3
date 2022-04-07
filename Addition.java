import java.util.Scanner;
public class Addition{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int x,y;
int f = 1;
System.out.println("Veuillez saisir x ");
x = scanner.nextInt();
System.out.println("Veuillez saisir  y ");
y = scanner.nextInt();
int S = x+y;
if (x < y) {
if (y!=0 & y!=1) {
for (int i =1 ; i<y+1 ; i++) {
f=f*i; }
} else
{f=1 ;}
} else { for (int i =2 ; i<x+1 ; i++) {
f=f*i; }
}
System.out.println("la Somme est " + S);
System.out.println("la factorielle est" + f);
}
}

