public class Contact
{
   public String name;
   public String rel;
   public String bday;
   public String phone; 
   public String email;
   public Contact(String name, String relation, String bday, String phone, String email)
   {
      this.name = name;
      rel = relation;
      this.bday = bday;
      this.phone = phone;
      this.email = email;
   }
   public void myToString()
   {
      System.out.printf("%12s  %7s  %6s  %14s  %20s %n",name,rel,bday,phone,email);
   }
}