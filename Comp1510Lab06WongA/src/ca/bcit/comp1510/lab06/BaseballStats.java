package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line of the file
 * contains a name followed by a list of symbols indicating the result of each
 * at bat: h for hit, o for out, w for walk, s for sacrifice. Statistics are
 * computed and printed for each player.
 * 
 * @author blink
 *
 */
public class BaseballStats {
    /*
     * Reads baseball stats from a file and counts total hits, outs, walks, and
     * sacrifice flies for each player.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;

        int out = 0, hit = 0, sac = 0, walk = 0;

        Scanner scan = new Scanner(System.in);

        // fileScan = new Scanner(new File("src/stats.dat"));

        // TODO Read and process each line of the file
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));

        while (fileScan.hasNext()) {
            fileName = fileScan.nextLine();
            // System.out.println ("Name:" + fileName);

            // src/stats.dat
            lineScan = new Scanner(fileName);
            lineScan.useDelimiter(",");
            System.out.println("Name:" + fileName);

            System.out.println(lineScan.next());

            for (int i = 0; i < fileName.length(); i++)

            {
                if (fileName.charAt(i) == 's') {
                    sac++;

                } else if (fileName.charAt(i) == 'o') {
                    out++;

                } else if (fileName.charAt(i) == 'h') {
                    hit++;

                } else if (fileName.charAt(i) == 'w') {
                    walk++;

                }

            }

            System.out.println(": Walks: " + walk + ", Hits: " + hit + ", Sacrifice: " + sac + ", Outs: " + out
                    + ", Batting average: " + ((double) hit / (double) (hit + out)));
        }

        fileScan.close();

    }
}

//}
