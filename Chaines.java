import java.util.Scanner;
public class Chaines 
{
     public static void main(String[] args) {
int n;
String temporaire;
     Scanner scanner = new Scanner(System.in);
     System.out.print("Saisir le nombre de chaines de caractere  : ");
n = scanner.nextInt();

String Chaine[] = new String[n];
     Scanner scanner1 = new Scanner(System.in);
     System.out.println("Entrez la liste des chaines:");

for(int i=0; i < n; i++)
    {Chaine[i] = scanner1.nextLine();}
for (int i=0; i < n; i++)
    {for (int j=i+1; j < n; j++)
            {if (Chaine[i].compareTo(Chaine[j]) > 0)
                    {temporaire= Chaine[i];
                     Chaine[i] = Chaine[j];
                     Chaine[j] = temporaire;}}}

System.out.print("Liste de noms dans l'ordre trié est : ");
for (int i=0; i < n-1; i++)
{System.out.print(Chaine[i] + ",");}
System.out.print(Chaine[n - 1]);}

}