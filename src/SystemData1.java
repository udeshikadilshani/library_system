

public class SystemData1 {
    private static String currentUser;
    private static String userType;
    private static String employee;
      
      public static String getCurrentUser(){
          return currentUser;
      }
      public  static void setCurrentUser(String aCurrentUser){
      currentUser=aCurrentUser;
      }

    public static void setcurrentUser(String aCurrentUser) {
        currentUser =aCurrentUser;
    }
    public static String getUserType(){
          return userType;
      } 
    
    public static void setUserType(String aUserType) {
        userType=aUserType;
    }
     public static String getEmployee(){
          return employee;
      } 
    
    public static void setEmployee(String aEmployee) {
        employee=aEmployee;
    }
    
}
