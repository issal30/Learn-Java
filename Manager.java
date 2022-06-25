class Manager{
 String getCorner(){
     return "Parent Class";
 }

}
class VPresident extends Manager{
    String getCorner(){
        return "Child Class";
    }
    String getParentCorner(){
        return super.getCorner();
    }

}
