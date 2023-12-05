package com.example.wordbook.service.impl;

import com.example.wordbook.mapper.WordmsgMapper;
import com.example.wordbook.pojo.SimpleWordmsg;
import com.example.wordbook.pojo.Wordmsg;
import com.example.wordbook.service.WordmsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Wordmsg服务业务逻辑处理的实用类
 *
 * @author 赵俊宇
 * @date 2023/12/05
 */
@Service
public class WordmsgServiceImpl implements WordmsgService {

    @Autowired
    private WordmsgMapper wordmsgMapper;

    @Override
    public Wordmsg getWordmsg(String word) {
        return wordmsgMapper.getWordmsg(word);
    }

    @Override
    public List<SimpleWordmsg> getSimpleWordmsg(String word) {
        return wordmsgMapper.getSimpleWordmsg(word);
    }
}
