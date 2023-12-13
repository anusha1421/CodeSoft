package org.experiential;

//1. Define a Employee class with a inner class definition to hold employee’s
//Date_of_Birth and Date_of_Join. Assume appropriate attributes of the
//class.
public class Employee{
    public static class Date_of_Birth {
        Date_of_Birth() {
            int dob ;


        }
        int get_birth(int dob){
            return dob;
        }
    }
        public static class Date_of_join{
            Date_of_join() {
                String join ;
            }
            String get_join(String join){
                return join;
            }

        }


}
