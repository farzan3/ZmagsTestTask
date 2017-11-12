package com.zmags.task.Test;

import com.zmags.task.FileAnalyzer;
import com.zmags.task.dto.Word;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileAnalyzerTest {

    @Test
    public void testGetMostOccuredWords() {

        FileAnalyzer analyzer = new FileAnalyzer("testfile.txt");

        List<Word> expResult = new ArrayList<>();
        expResult.add(new Word("Foo", 3));
        expResult.add(new Word("Bar", 1));

        List<Word> result = analyzer.getMostOccuredWords();
        assertEquals(expResult, result);

    }

}
