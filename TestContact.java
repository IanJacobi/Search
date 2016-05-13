import java.util.*;
public class TestContact
{
   public static void main( String args[])
   {
      ArrayList<Contact> myContacts = new ArrayList<Contact>();
       myContacts.add(new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com"));
       myContacts.add(new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com"));
       myContacts.add(new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com"));
       myContacts.add(new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com"));
       myContacts.add(new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.cod"));
       myContacts.add(new Contact("Johnnie" ,"friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com"));
      //sortName(myContacts);
      
      sortName(myContacts);
      printContacts(myContacts);
      searchName(myContacts, "Johnnie");
      searchName(myContacts, "Sam Parker");
      searchRelation(myContacts, "friend");
      searchRelation(myContacts, "Aunt");
      searchBMonth(myContacts, "Mar");
      searchBMonth(myContacts, "May");
      searchPhone(myContacts,"(333) 555-8989");
      searchPhone(myContacts,"(342) 555-7011");
      searchEmail(myContacts, "rgoodman@hotmail.com");
      searchEmail(myContacts, "susieE@hotmail.com");
   }
   static void printContacts(ArrayList<Contact> c)
   {
      for(int i = 0; i < c.size(); i ++)
      {
         c.get(i).myToString();
      }
   }
   static ArrayList<Contact> sortName(ArrayList<Contact> c)
   {
      int j, i;
         for (i = 1; i < c.size(); i++) {
            Contact key = new Contact("", "","", "", "");
            key.name = c.get(i).name;
            key.rel = c.get(i).rel;
            key.phone = c.get(i).phone;
            key.email = c.get(i).email;
            key.bday = c.get(i).bday;
            j = i;
            while((j > 0) && (c.get(j - 1).name.compareTo(key.name) > 0)) {
               c.set(j,c.get(j - 1));
               j--;
            }
        c.set(j,key);
        }
        return c;
   }
   static ArrayList<Contact> sortEmail(ArrayList<Contact> c)
   {
      int j, i;
         for (i = 1; i < c.size(); i++) {
            Contact key = new Contact("", "","", "", "");
            key.name = c.get(i).name;
            key.rel = c.get(i).rel;
            key.phone = c.get(i).phone;
            key.email = c.get(i).email;
            key.bday = c.get(i).bday;
            j = i;
            while((j > 0) && (c.get(j - 1).email.compareTo(key.email) > 0)) {
               c.set(j,c.get(j - 1));
               j--;
            }
        c.set(j,key);
        }
        return c;
   }

   static void searchName(ArrayList<Contact> c, String s)
   {
      sortName(c);
      System.out.println("Searched for " + s + " Found: ");
      int mid = c.size() / 2;
      int i;
      int n = 0;
      if(s.compareTo(c.get(mid).name) >= 0)
      {
         for(i = mid; i < c.size(); i++)
         {
            if(c.get(i).name.equals(s))
            {
               c.get(i).myToString();
               n++;
            }
         }
      }
      else
      {
        for(i = 0; i < mid; i++)
         {
            if(c.get(i).name.equals(s))
            {
               c.get(i).myToString();
               n++;
            }
         }
 
      }
      if(n == 0)
      {
         System.out.println("No results were found");
      }

   }
   static void searchRelation(ArrayList<Contact> c, String s)
   {
      int n = 0;
      System.out.println("Searched for " + s + " Found : ");
      for(int i = 0; i < c.size(); i++)
      {
         if(c.get(i).rel.equals(s))
         {
            c.get(i).myToString();
            n++;
         }
      }
      if(n == 0)
      {
         System.out.println("No results were found");
      }
   }
   static void searchBMonth(ArrayList<Contact> c, String s)
   {
      int n = 0;
      System.out.println("Searched for " + s + " Found : ");
      for(int i = 0; i < c.size(); i++)
      {
         if(c.get(i).bday.substring(0,3).equals(s))
         {
            c.get(i).myToString();
            n++;
         }
      }
      if(n == 0)
      {
         System.out.println("No results were found");
      }

   }
   static void searchPhone(ArrayList<Contact> c, String s)
   {
      int n = 0;
      System.out.println("Searched for " + s + " Found : ");
      for(int i = 0; i < c.size(); i++)
      {
         if(c.get(i).phone.equals(s))
         {
            c.get(i).myToString();
            n++;
         }
      }
      if(n == 0)
      {
         System.out.println("No results were found");
      }

   }
   static void searchEmail(ArrayList<Contact> c, String s)
   {
      sortEmail(c);
      System.out.println("Searched for " + s + " Found: ");
      int mid = c.size() / 2;
      int i;
      int n = 0;
      if(s.compareTo(c.get(mid).email) >= 0)
      {
         for(i = mid; i < c.size(); i++)
         {
            if(c.get(i).email.equals(s))
            {
               c.get(i).myToString();
               n++;
            }
         }
      }
      else
      {
        for(i = 0; i < mid; i++)
         {
            if(c.get(i).email.equals(s))
            {
               c.get(i).myToString();
               n++;
            }
         }
 
      }
      if(n == 0)
      {
         System.out.println("No results were found");
      }

   }
}