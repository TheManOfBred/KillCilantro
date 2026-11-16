public class KillCilantro {
   public static String killCilantro(String message) {
      String newStr = message;
      for (int i = 0; i <= newStr.indexOf("cilantro"); i++) {
         int loc = newStr.indexOf("cilantro");
         if (loc >= 0) {
            newStr = newStr.substring(0, loc) + "parsley" + newStr.substring(loc + 8);
            
               
         }
            
      }
      
      return newStr;
   }
   public static void main(String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
   }
}