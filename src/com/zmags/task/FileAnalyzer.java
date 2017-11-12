package com.zmags.task;

import com.zmags.task.dto.Word;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FileAnalyzer {

    private final int elementCount;
    private final String spliter = "[^a-zA-Z0-9]+";
    private final String filePath;
    private final Boolean ignoreCase;

    public FileAnalyzer(String filePath) {
        this.filePath = filePath;
        ignoreCase = false;
        elementCount = 10;
    }

    public FileAnalyzer(String filePath, int elementCount) {
        this.filePath = filePath;
        this.elementCount = elementCount;
        ignoreCase = false;
    }

    public FileAnalyzer(String filePath, boolean ignoreCase) {
        this.filePath = filePath;
        this.elementCount = 10;
        this.ignoreCase = ignoreCase;
    }

    public FileAnalyzer(String filePath, int elementCount, boolean ignoreCase) {
        this.filePath = filePath;
        this.elementCount = elementCount;
        this.ignoreCase = ignoreCase;
    }

    /**
     * public function responsible for calling other functions
     * Read line by line file 
     * Split it and populate hashMap
     * When file is completed it pass hashTable to minHeap to find K most frequent words
     * get results from minHeap and sort them
     */
    public List<Word> getMostOccuredWords() {

        BufferedReader bufferedReader = null;
        FileReader file = null;
        List<Word> mostOccuredWord = null;
        try {
            file = new FileReader(filePath);
            bufferedReader = new BufferedReader(file);
            mostOccuredWord = getMostOccuredWords(bufferedReader);

        } catch (IOException iOException) {

        } finally {

            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException exception) {

            }

        }
        return mostOccuredWord;
    }

    private List<Word> getMostOccuredWords(BufferedReader bufferedReader) throws IOException {

        Map<String, Integer> wordFrequency = new HashMap<>();
        PriorityQueue<Word> minHeap = new PriorityQueue<>(Comparator.comparingInt(wc -> wc.getFrequency()));

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            String[] tokens = Tokenize(line);
            addUpdateFrequency(tokens, wordFrequency);
        }

        buildMinHeap(wordFrequency, minHeap);

        return getSoretedResults(minHeap);

    }

    /**
     * get results from minHeap and sort them
     */
    private List<Word> getSoretedResults(PriorityQueue<Word> minHeap) {

        List<Word> results = new ArrayList<>();
        while (minHeap.size() > 0) {
            results.add(minHeap.poll());
        }
        Collections.reverse(results);
        return results;

    }

    /**
     * Create MinHeap from HashTable
     */
    private void buildMinHeap(Map<String, Integer> wordFrequency, PriorityQueue<Word> minHeap) {

        for (Map.Entry<String, Integer> word : wordFrequency.entrySet()) {

            Word word1 = new Word(word.getKey(), word.getValue());
            addUpdateMinHeap(word1, minHeap);
        }
    }

    
      /**
     * Add words form hashTable to minHeap
     */
    private void addUpdateMinHeap(Word word, PriorityQueue<Word> minHeap) {

        if (minHeap.size() < elementCount) {
            minHeap.offer(word);
        } else if (minHeap.peek().getFrequency() < word.getFrequency()) {
            minHeap.poll();
            minHeap.offer(word);
        }
    }

      /**
     * add or update element to HashTable if it already exist it just update frequency
     */
    private void addUpdateFrequency(String[] tokens, Map<String, Integer> wordFrequency) {

        for (String rawToken : tokens) {

            String token = rawToken.trim();
            if (token.length() == 0) {
                continue;
            }
            int count = 0;
            if (wordFrequency.containsKey(token)) {
                count = wordFrequency.get(token);
            }
            count++;
            wordFrequency.put(token, count);
        }

    }

      /**
     * Split one line into token . split any char other then A-Z,a-z and 0-9
     */
    private String[] Tokenize(String text) {
        if (ignoreCase) {
            text = text.toLowerCase();
        }
        return text.split(spliter);
    }
}
