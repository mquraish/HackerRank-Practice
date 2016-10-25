import java.util.*;

public class Solution {
    List<String> magazineMap;
    List<String> noteMap;
    String magazine;
    String note;
    public Solution(String magazine, String note) {
        this.magazine = magazine.toLowerCase();
        this.note = note.toLowerCase();
    }

    public boolean solve() {
        String[] mag = magazine.split(" ");
        String[] not = note.split(" ");
        magazineMap = new LinkedList<String>(Arrays.asList(mag));
        noteMap = new LinkedList<String>(Arrays.asList(not));

        for(String note: noteMap){
            if(magazineMap.contains(note)) magazineMap.remove(note);
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
