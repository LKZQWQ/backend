package com.example.wordbook.service;

import com.example.wordbook.pojo.SimpleWordmsg;
import com.example.wordbook.pojo.Wordmsg;

import java.util.List;

public interface WordmsgService {
    Wordmsg getWordmsg(String word);

    List<SimpleWordmsg> getSimpleWordmsg(String word);
}
