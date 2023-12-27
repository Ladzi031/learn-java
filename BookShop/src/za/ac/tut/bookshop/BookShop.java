package za.ac.tut.bookshop;

import java.util.ArrayList;
import java.util.Scanner;
import za.ac.tut.comicnovel.ComicNovel;
/**
 * @author Ladzani_fabian
 */
public class BookShop {
    public static void main(String[] args) {
        // TODO code application logic here
        // this is mimicking a database, I think
        Scanner sc = new Scanner(System.in);
        
        String[] bookInfo = {
            "The Stupidest Angel#2#CM002",
            "Vile Bodies#8#EW008",
            "Cold Comfort Farm#1#SG001",
            "Lightning Rods#2#HDW002",
            "A Complicated Kindness#1#MT001",
            "Auntie Mame#9#PD009",
            "Catch-22#5#JH005",
            "The Color of Magic#1#TP001",
            "Lucky Jim#3#KA003"
        };
        int numberOfBooks = bookInfo.length;
        ArrayList<ComicNovel> comicNovels = new ArrayList<>(numberOfBooks);
        for(int i = 0; i < numberOfBooks; i++){
            String comicBook = bookInfo[i];
            int firstHash = comicBook.indexOf("#");
            int lastHash = comicBook.lastIndexOf("#");
            String title = comicBook.substring(0, firstHash);
            String bookVolume = comicBook.substring((firstHash+1),lastHash);
            int volume = Integer.parseInt(bookVolume);
            String code = comicBook.substring(lastHash+1);
            
            //create object
            ComicNovel novel = new ComicNovel(title, volume, code);
            comicNovels.add(novel);
        }
        System.out.println("the list of comic novels with its search codes:");
        System.out.println("===================================================================");
        String bookDetails = globalDetails(comicNovels);
        System.out.println(bookDetails);
        
        System.out.print("Enter the code of comic novel: ");
        String comicNovelcode = sc.next(); // I might need to validate this value!!
        
        boolean isfirstEdition = isFirstEdition(comicNovels, comicNovelcode);
        String results = isfirstEdition ? "The comic novel with the code "+ comicNovelcode.toUpperCase() + " is a first edition and a collectors item":
                "The comic novel with the global code "+ comicNovelcode.toUpperCase() + "is NOT a first edition and is not a collectors item or it does not exist in the database in general!";
         System.out.println(results);
        
    }
    public static String globalDetails(ArrayList<ComicNovel> bookDetails){
        String tempString = "";
        for(ComicNovel novel: bookDetails){
            String tempTitle = novel.getTitle();
            String tempCode = novel.getCode();
            String joinString = tempTitle + " => "+ tempCode + "\n";
            tempString += joinString;
        }
        return tempString;
    }
    
    public static boolean isFirstEdition(ArrayList<ComicNovel> getBookEdition, String searchForCodeString){
        boolean isFirstEdition = false;
        int edition = 0;
        for(ComicNovel novel: getBookEdition){
            if(novel.getCode().equalsIgnoreCase(searchForCodeString)){
               edition =  novel.getVolume();
              break;
            }
        }
        if(edition == 1){
            isFirstEdition = true;
        }
        
        return isFirstEdition;
    }
    
}
