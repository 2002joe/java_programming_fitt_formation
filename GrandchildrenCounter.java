import java.util.*;

public class GrandchildrenCounter 
{

    
    public static int countGrandchildren(String[][] relationships, String father) {
        Map<String, List<String>> familyTree = new HashMap<>();

        
        for (String[] relation : relationships) {
            String child = relation[0];
            String parent = relation[1];
            familyTree.putIfAbsent(parent, new ArrayList<>());
            familyTree.get(parent).add(child);
        }

        
        int grandchildrenCount = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(father);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (familyTree.containsKey(current)) {
                List<String> children = familyTree.get(current);
                for (String child : children) {
                    if (familyTree.containsKey(child)) {
                        grandchildrenCount += familyTree.get(child).size();
                        queue.addAll(familyTree.get(child));
                    }
                }
            }
        }

        return grandchildrenCount;
    }

    public static void main(String[] args) {
        String[][] relationships = {
            {"luke", "shaw"},
            {"wayne", "rooney"},
            {"rooney", "ronaldo"},
            {"shaw", "rooney"}
        };
        String father = "ronaldo";

        int grandchildren = countGrandchildren(relationships, father);
        System.out.println("Number of grandchildren for " + father + ": " + grandchildren);
    }
}
      

