package vydraKata;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.sort;

public class wordCounter {

    /*
1. Read words from a String variable "input".
2. Count the number of times words are mentioned in the sentence.
3. Sort the repeated word list from maximum repetitions to minimum.

Example:

String Variable Contents: This is my book. My book is amazing. I love my book.

Program's result should be:
my - 3
book - 3
is - 2
this - 1
amazing - 1
I - 1
love - 1
 */
    public static void main(String[] args) {
        String sentence ="This is my book. My book is amazing. I love my book.";

        // count and track the occurrences of each word
        //use find method on each word or count when it is same word
        //build a new list, then print out in order of count
        //
        //String sentence = "This is a word sentence that this is to show that words are a sentence is a right for this person.";
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        List<String> CountedWords = new ArrayList<>();
        int wordFrequency;
        for(String w : words){
            wordFrequency = Collections.frequency(Arrays.asList(words), w);
            CountedWords.add(wordFrequency + " - " + w);
        }
        List<String> listWithoutDuplicates = CountedWords.stream()
                .distinct()
                .collect(Collectors.toList());
        Collections.sort(listWithoutDuplicates,Collections.reverseOrder());
        System.out.print(listWithoutDuplicates );

    }}
