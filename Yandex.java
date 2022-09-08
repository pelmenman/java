import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayList;
import java.util.TreeSet;
import javafx.util.Pair;

public class Yandex {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int numOfStrings = cin.nextInt();
        ArrayList<String> graph = new ArrayList<String>();
        TreeSet tree = new TreeSet();
        int numOfPairs = 1;

        for (int i = 0; i <= numOfStrings; i++) {
            String str = cin.nextLine();

            for (int j = 0; j < str.length() - 3; j++) {
                String subStr = (String) (str.subSequence(j, j + 3));
                graph.add(subStr);
                tree.add(subStr);
            }

            String first = graph.get(0);
            String second = graph.get(1);
            int z = 1;

            while (!(graph.get(z).equals(first) && graph.get(z + 1).equals(second)) || z < graph.size()) {
                numOfPairs++;
                z++;
            }

            System.out.println(z);

            for (int h = 0; h < graph.size() - 1; h++) {
                String a = graph.get(h);
                String b = graph.get(h + 1);
                int count = 1;

                for (int g = h + 2; g < graph.size() - 1; g++) {

                    String c = graph.get(g);
                    String d = graph.get(g + 1);
                    if (a.equals(c) && b.equals(d)) {
                        count++;
                    }

                }

                System.out.println(a + " " + b + " " + count);

            }
        }

        int v = tree.size();

        System.out.println(v);

        for (Object element : graph) {
            System.out.println(element);
        }
        cin.close();

    }
}
