import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws NoSuchOrderByException {


        Book first = new Book(1493945L, "Fill S.", "Audit", new Date());
        Book second = new Book(38213L, "Sidd R.", "More", new Date());
        Book third = new Book(2358L, "Siery A.", "Authentication", new Date());


        InternetLibrary library = new InternetLibrary();
        library.addBook(first);
        library.addBook(second);
        library.addBook(third);

        File file = new File("new");
        file.createNewFile();
        try (FileOutputStream out = new FileOutputStream(file))
            for(Book book: library.ge)
//        System.out.println("Unsorted: " + "\n"  + library.toString() );
//
//        System.out.println("Sorted Library: " + "\n" + library.sort().toString() );
//
//        System.out.println(library.findBook(new Date()));

//        System.out.println(library.findBook("Morsae"));
//        System.out.println(library.findBookByAuthor("Sidd R."));
//        System.out.println(library.findBook(1542358L));



//        long[] arra = {3, 101, 1 , 6, 7};
//
//
//
//        int bucket;
//       arrayPrint(arra);
//
//
//        for (int i = arra.length - 1; i >= 0; i--){
//            for (int k = 0; k < i; k++){
//                if (arra[k] > arra[k+1]){
//                    long t = arra[k+1];
//                    arra[k+1] = arra[k];
//                    arra[k] = t;
//                }
//            }
//        }
//        arrayPrint(arra);





//
//    }
//    static void arrayPrint(long[] arr){
//        for(long i: arr){
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
//

        System.out.println(library.sort(OrderBy.BY_AUTHOR));

    }

}
