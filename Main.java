package Phase1;

import java.util.regex.Pattern;

public class Main{
public static boolean isValid(String email)
{
String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
Pattern pattern = Pattern.compile(regex);
if (email == null)
return false;
return pattern.matcher(email).matches();
}
public static void main(String args[]){
String email = "nithya+ @gmail.com";
boolean result = isValid(email);
if (result == true)
System.out.println("Provided email address "+ email+ " is valid \n");
else
System.out.println("Provided email address "+ email+ " is invalid \n");
}
}