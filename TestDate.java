
public class TestDate
{
     public static void main(String [] args)
     {
         int j=Integer.parseInt(args[0]);
         int m=Integer.parseInt(args[1]);
         int a=Integer.parseInt(args[2]);
         
         System.out.println(j+"/"+m+"/"+a);
         Date d = new Date (j,m,a);
         System.out.println("le numéro du jour dans l’année"+ d.jour_dans_annee ());
      }
     
}
