package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Collection {

    public static void main(String[] args){        
        displayIndex(buildIndex("Hello This is new as can see the tihgin as soon as this is "));
    }
    Map<String, CollectionStudent> _matricToStudents;
    public Collection(){
        _matricToStudents = new HashMap<>();
    }
    public void addStudent(String matricNumber, CollectionStudent student){
        _matricToStudents.put(matricNumber, student);
    }

    public void displayAll(){
        Set<String> matrics = _matricToStudents.keySet();
        for (String matric: matrics){
            System.out.print(_matricToStudents.get(matric));
        }
    }

    public CollectionStudent getStudent(String matric){
        return _matricToStudents.get(matric);
    }

    public void updateName(String matric, String newName){
        CollectionStudent student = _matricToStudents.get(matric);
        if(student != null){
            student.setName(newName);
        }
    }

    static Map<String, List<Integer>> buildIndex(String paragraph){
        Map<String, List<Integer>> index = new HashMap<String, List<Integer>>();
        Scanner paragraphScanner = new Scanner(paragraph);
        int lineNumber = 1;
        while(paragraphScanner.hasNext()){
            String line = paragraphScanner.nextLine().toLowerCase();

            String[] words = line.split("\\s+");//break words using space
            for(String word: words){
                word = word.replaceAll("[^\\w]","");
                addWordLineNumber(index, lineNumber, word);
            }
            lineNumber++;
        }
        paragraphScanner.close();
        return index;
    }

    static void addWordLineNumber(
        Map<String, List<Integer>> index, 
        int lineNumber, String word) {
        List<Integer> lineList = index.get(word);
        if (lineList == null) {
        // Create new list for new word
        lineList = new ArrayList<>();
        index.put(word, lineList);
        }
        lineList.add(lineNumber);
    }
    
    static void displayIndex(Map<String, List<Integer>> index){
        Set<String> wordSet = index.keySet();
        List<String> wordList = new ArrayList<>(wordSet);
        Collections.sort(wordList);

        for(String word: wordList){
            
            System.out.print(word + ": ");
            for(Integer line: index.get(word)){
                System.out.print(line + " ");
            }
            System.out.println();
        }
        
    }

    
    

    
    
}
