import Model.Book;
import Model.FictionBook;
import Model.ProgrammingBook;

public class BookManager {
    public static void main(String[] args) {
        Book book1 = new ProgrammingBook(101, "KnowAboutJava", 10.5, "KA", "Java", "Spring");
        Book book2 = new ProgrammingBook(102, "LearningJava", 12.5, "DA", "Java", "Spring");
        Book book3 = new ProgrammingBook(103, "LearningJavaScript", 13.5, "DucAnh", "JavaScript", "React");
        Book book4 = new ProgrammingBook(104, "LearningC++", 14.5, "YOLO", "C++", "ASP.net");
        Book book5 = new ProgrammingBook(105, "MasterInCode", 15.5, "Chau", "Java", "Spring");

        Book ficBook1 = new FictionBook(21, "AdventureTime", 25.5, "NDA", "Novel");
        Book ficBook2 = new FictionBook(22, "Cuộc chiến của ĐA với Coder", 23.5, "Coder DucAnh", "Viễn tưởng 1");
        Book ficBook3 = new FictionBook(23, "The Amazing DucAnh", 41.5, "TADA", "Viễn tưởng 1");
        Book ficBook4 = new FictionBook(24, "Chua Te Nhung Chiec Nhan", 69.5, "KieuAnh", "Novel");
        Book ficBook5 = new FictionBook(25, "DA va cuoc chien khong hoi ket", 74.12, "NDA", "Novel");

        Book[] books = {book1,book2,book3,book4,book5,ficBook1,ficBook2,ficBook3,ficBook4,ficBook5};
        getTotalPrice(books);
        countJava(books,"Java");
        countCategoryFB(books,"Viễn tưởng 1");
        countBooksUnder100(books,100);
    }

    public static double getTotalPrice(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum+= books[i].getPrice();
        }
        return sum;
    }

    public static int countJava(Book[] books,String language){
        int count = 0;
        for (int i = 0;i< books.length;i++){
            if (books[i] instanceof ProgrammingBook){
                String language1 = ((ProgrammingBook)books[i]).getLanguage();
                if (language1.equals(language)) count++;
            }
        }
        return count;
    }

    public static int countCategoryFB(Book[] books,String category){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook){
                String category1 = ((FictionBook)books[i]).getCategory();
                if (category1.equals(category)) count++;
            }
        }
        return count;
    }

    public static int countBooksUnder100(Book[] books,double price){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook){
                if (books[i].getPrice()<price) count++;
            }
        }
        return count;
    }
}
