package lesson5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TextMain {
    public static void main(String[] args) throws IOException {
        File fileLorem1 = new File("some/lorem1.txt");
        File fileLorem = new File("lorem.txt");

        File dir = new File(".");

        File[] files = dir.listFiles();
        for (File file : files) {
//            System.out.println(file.getName() ); /*print names*/
            System.out.println(file.toURI()); /* print names to URI*/
        }


          /*Copy  file 'lorem.txt' to 'lorem1.txt' */
//        File fileLorem1 = new File("lorem1.txt");
//        File fileLorem = new File("lorem.txt");
//        FileUtils.copyFile(fileLorem, fileLorem1);


//      /*Create file 'lorem1.txt' and than copy byte by byte from 'lorem.txt' to 'lorem1.txt' */
//        File fileLorem1 = new File("lorem1.txt");
//        File fileLorem = new File("lorem.txt");
//        fileLorem1.createNewFile();
//        /* read from the 'lorem.txt' */
//        List<String> list = FileUtils.readLines(fileLorem, "UTF-8");
//        /* write to the 'lorem1.txt' */
//        FileUtils.writeLines(fileLorem1, list, true);
//        /* read from the 'lorem1.txt' */
//        list = FileUtils.readLines(fileLorem1, "UTF-8");
//        /* print just read */
//        list.forEach(System.out::println);

//        file.createNewFile();

//        file.deleteOnExit();

//        String s = FileUtils
//                .readFileToString(file, "UTF-8")
//                .replaceAll("\\p{P}", "");
//        String[] s1 = s.split(" ");
//
//
//        for (int i=0; i <s1.length; i++) {
//            System.out.println( i + " " + s1[i]);
//
//        }
    }
}
