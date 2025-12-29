import java.util.*;

public class LegalKeywordAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] keywords = {
            "right", "duty", "contract", "law", "agreement",
            "court", "privacy", "obligation", "liability"
        };

        System.out.println("Enter legal text:");
        String text = sc.nextLine().toLowerCase();

        Map<String, Integer> frequency = new HashMap<>();

        for (String keyword : keywords) {
            frequency.put(keyword, 0);
        }

        for (String word : text.split("\\W+")) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            }
        }

        System.out.println("\nKeyword Frequency:");
        for (String key : frequency.keySet()) {
            System.out.println(key + ": " + frequency.get(key));
        }

        sc.close();
    }
}
