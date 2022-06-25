class Person {
   String name;
   String address;
   final String country = "Indonesia";

   Person( String paramName, String paramAddress){
      name = paramName;
      address = paramAddress;
   }

   void sayHello(String people){
      System.out.println("Hello " + people +". " + "My name is " + name);
   }



   @Override
   public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", address='" + address + '\'' +
              ", country='" + country + '\'' +
              '}';
   }
}
