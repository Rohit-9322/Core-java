
// Project 4 

// Library System

// YOU Have to implement a library using java class library 
// Method :-- AddBook, IssuBook , ReturnBook, ShowAvalableBook
// Properties -- Array to Store the issuse book  


class library{
    String[] book = new String[10];
    int Count = 0;

    // AddBook 
    void AddBook(String book){
       this.book[Count] = book;
        Count++;
        System.out.println(book+" added Successfully");


    }

    // Show Avaliable Book
    void ShowAvalableBook(){
        System.out.println(" \n Available book ");
    for(int i=0; i< Count; i++){
        if(book[i] != null){
            System.out.println(" "+book[i]);
        }
    }


 } 
 
  // Issue Book
  void IssuBook(String book){
        for(int i=0; i<Count; i++){
        if (this.book[i] != null && this.book[i].equals(book)) {
            this.book[i] = null;
            System.out.println(book +" Issude Successfully ");
            return;
        }
    }
    System.out.println("Book Not Found"); 
 
    

   
 }
   // Return Book 
    void ReturnBook(String book){
    for(int i=0; i< Count; i++){
        if (this.book[i] == null) {
            this.book[i] = book;
            System.out.println(book+" Returend Succfully! ");
            return;
        }
    }
  }


}

public class Project4 {
    
    public static void main(String[] args) {
        library l = new library();
        
        l.AddBook("Marathi");
        l.AddBook("Math");
        l.AddBook("English");

        l.ShowAvalableBook();
        
        l.IssuBook("English");

        l.ShowAvalableBook();

        l.ReturnBook("English");
    }
}
