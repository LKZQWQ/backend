package com.example.wordbook.service;

import com.example.wordbook.pojo.SimpleWordmsg;
import com.example.wordbook.pojo.Wordmsg;

import java.util.List;

/**
 * wordmsg业务处理的服务接口
 *
 * @author 赵俊宇
 * @date 2023/12/04
 */
public interface WordmsgService {
    Wordmsg getWordmsg(String word);

    List<SimpleWordmsg> getSimpleWordmsg(String word);
}
