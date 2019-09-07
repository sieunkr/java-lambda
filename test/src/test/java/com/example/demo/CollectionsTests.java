package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class CollectionsTests {


    @Test
    public void 익명클래스의_인스턴스를_함수_객체로_사용(){

        List<String> words = Arrays.asList("맨유", "첼시", "아스날", "리버풀", "맨시티");

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        List<String> exceptedWords = Arrays.asList("리버풀", "맨시티", "맨유", "아스날", "첼시");
        assertEquals(words, exceptedWords);
    }

    public void 람다식을_함수_객체로_사용(){
        List<String> words = Arrays.asList("맨유", "첼시", "아스날", "리버풀", "맨시티");

        Collections.sort(words, (o1, o2) -> o1.compareTo(o2));

        List<String> exceptedWords = Arrays.asList("리버풀", "맨시티", "맨유", "아스날", "첼시");
        assertEquals(words, exceptedWords);
    }

    public void 메서드_참조(){
        List<String> words = Arrays.asList("맨유", "첼시", "아스날", "리버풀", "맨시티");
        
        Collections.sort(words, String::compareTo);

        List<String> exceptedWords = Arrays.asList("리버풀", "맨시티", "맨유", "아스날", "첼시");
        assertEquals(words, exceptedWords);
    }


}
