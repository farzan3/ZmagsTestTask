package com.zmags.task.dto;

import java.util.Objects;

public class Word {

    private String word;
    private int frequency;

    public Word() {

        word = "";
        frequency = 0;
    }

    public Word(String word, int frequency) {

        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }
        if (!(other instanceof Word)) {
            return false;
        }
        Word otherWord = (Word) other;

        return otherWord.word.equals(word)
                && otherWord.frequency == frequency;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.word);
        hash = 89 * hash + this.frequency;
        return hash;
    }

}
