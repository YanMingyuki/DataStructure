/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1012;

/**
 *
 * @author User
 */
public class Author {
   private String name;
   private String email;
   private char gender;
 
   public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
 
   public String getName() {
      return name;
   }
   
   public char getGender() {
      return gender;
   }
   
   public String getEmail() {
      return email;
   }
   
   public void setEmail(String email) {
      this.email = email;
   }
     
}
