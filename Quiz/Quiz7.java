package Quiz;

 class Quiz7 {
     String resto;
     String pemilik;

     public Quiz7(String resto, String pemilik) {
         this.resto = resto;
         this.pemilik = pemilik;
     }

     @Override
     public String toString() {
         return "Quiz7{" +
                 "resto='" + resto + '\'' +
                 ", pemilik='" + pemilik + '\'' +
                 '}';
     }
 }
class Quiz7Child extends Quiz7{
     public Quiz7Child(String resto, String pemilik){
         super(resto,pemilik);
     }
}