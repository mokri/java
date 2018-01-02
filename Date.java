import java.util.*;
public class Date
{
    private int jour,mois,annee;
    
    public Date(int jr,int moi,int an)
    {
        jour=jr;
        mois=moi;
        annee=an;
    }
    
    public Date (Date d)
    {
        jour=d.jour;
        mois=d.mois;
        annee=d.annee;
    }
   //jour 
   
    
   public int getjour()
    {
        return jour;
    }
    
    public int setjour(int j)
    {
     jour=j;
     return jour;
    }
    
    // moi 
    
    
    public int getmois()
    {
        return mois;
    }
    
    public int setmois(int m)
    {
     mois=m;
     return mois;
    }
    
    // annee
    
    public int getannee()
    {
        return annee;
    }
    
    public int setannee(int a)
    {
     annee=a;
     return annee;
    }
    
    public boolean est_egale_a(int jour, int mois, int annee)
    {
        if(this.jour==jour && this.mois==mois && this.annee==annee)
        return true;
        else return false;
    }
   
    public boolean est_egale_a(Date d)
    {
        if(d.jour==jour && d.mois==mois && d.annee==annee)
        return true;
        else return false;
    }
  
    public void affiche()
    {
           System.out.println("/"+jour+"/"+mois+"/"+annee+" ");
    }
    
    public int jour_dans_annee ()
    {
        // Package des classes GregorianCalendar et Calendar est java.util
        GregorianCalendar gc = new GregorianCalendar ( annee , mois-1, jour ) ;
        gc . setTime ( gc.getTime ()) ;
        return ( gc.get ( Calendar.DAY_OF_YEAR ) ) ;
    }
}