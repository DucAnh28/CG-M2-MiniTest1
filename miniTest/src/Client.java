import Model.FictionBook;
import Model.ProgrammingBook;

public class Client {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook(101, "KnowAboutJava", 10.5, "KA", "Java", "Spring");
        ProgrammingBook book2 = new ProgrammingBook(102, "LearningJava", 12.5, "DA", "Java", "Spring");
        ProgrammingBook book3 = new ProgrammingBook(103, "LearningJavaScript", 13.5, "DucAnh", "JavaScript", "React");
        ProgrammingBook book4 = new ProgrammingBook(104, "LearningC++", 14.5, "YOLO", "C++", "ASP.net");
        ProgrammingBook book5 = new ProgrammingBook(105, "MasterInCode", 15.5, "Chau", "Java", "Spring");

        FictionBook ficBook1 = new FictionBook(21, "AdventureTime", 25.5, "NDA", "Novel");
        FictionBook ficBook2 = new FictionBook(22, "Cuộc chiến của ĐA với Coder", 23.5, "Coder DucAnh", "Viễn tưởng 1");
        FictionBook ficBook3 = new FictionBook(23, "The Amazing DucAnh", 41.5, "TADA", "Viễn tưởng 1");
        FictionBook ficBook4 = new FictionBook(24, "Chua Te Nhung Chiec Nhan", 69.5, "KieuAnh", "Novel");
        FictionBook ficBook5 = new FictionBook(25, "DA va cuoc chien khong hoi ket", 74.12, "NDA", "Novel");

//        Tính tổng số tiền
        double[] priceBook = {book1.getPrice(), book2.getPrice(), book3.getPrice(), book4.getPrice(), book5.getPrice(), ficBook1.getPrice(), ficBook2.getPrice(), ficBook3.getPrice(), ficBook4.getPrice(), ficBook5.getPrice()};
        System.out.println("Tổng số tiền là: " + priceOfBook(priceBook) + " $");
//        Đếm ngôn ngữ sách Model.ProgrammingBook
        String[] languageBook = {book1.getLanguage(), book2.getLanguage(), book3.getLanguage(), book4.getLanguage(), book5.getLanguage()};
        System.out.println("Number of books in Java language are: " + checkLanguage(languageBook));
//        Đếm thể loại fictionBook
        String[] categoryFB = {ficBook1.getCategory(), ficBook2.getCategory(), ficBook3.getCategory(), ficBook4.getCategory(), ficBook5.getCategory()};
        System.out.println("Number of books types of 'Vien tuong 1' are: " + checkCategory(categoryFB));
//        Đếm số sách Model.FictionBook có giá < 100
        double[] fictionBookPrice = {ficBook1.getPrice(), ficBook2.getPrice(), ficBook3.getPrice(), ficBook4.getPrice(), ficBook5.getPrice()};
        System.out.println("Number of Books have price under 100 are: " + priceUnder100(fictionBookPrice));
//        Tạo mảng đối tượng

    }

    public static int priceUnder100(double[] fbPrice) {
        int count = 0;
        for (int i = 0; i < fbPrice.length; i++) {
            if (fbPrice[i] < 100) {
                count++;
            }
        }
        return count;
    }

    public static int checkCategory(String[] categoryofFB) {
        int count = 0;
        for (int i = 0; i < categoryofFB.length; i++) {
            if ("Viễn tưởng 1".equals(categoryofFB[i])) {
                count++;
            }
        }
        return count;
    }

    public static double priceOfBook(double[] priceBook) {
        double sum = 0;
        for (double x : priceBook
        ) {
            sum += x;
        }
        return sum;
    }

    public static int checkLanguage(String[] languageBook) {
        int count = 0;
        for (int i = 0; i < languageBook.length; i++) {
            if ("Java".equals(languageBook[i])) {
                count++;
            }
        }
        return count;
    }
}