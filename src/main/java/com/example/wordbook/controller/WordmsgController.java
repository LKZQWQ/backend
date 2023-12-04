package com.example.wordbook.controller;

import com.example.wordbook.pojo.Result;
import com.example.wordbook.pojo.SimpleWordmsg;
import com.example.wordbook.pojo.Wordmsg;
import com.example.wordbook.service.WordmsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * 单词信息的控制器 用于接收请求与返回数据
 *
 * @author 赵俊宇
 * @date 2023/12/05
 */
@RestController
@RequestMapping("/search")
public class WordmsgController {

    @Autowired
    private WordmsgService wordmsgService;

    /**
     * 处理查词请求的方法: 得到完整单词信息
     *
     * @param word 需要查询的单词
     * @return Result.success(wordmsg) 单词的完整信息
     */
    @GetMapping
    public Result getWordmsg(String word) {
        Wordmsg wordmsg = wordmsgService.getWordmsg(word);
        if (wordmsg == null) return Result.error("查询失败");

        return Result.success(wordmsg);
    }

    /**
     * 处理查词请求的方法: 获取wordmsg精简信息
     *
     * @param wordSlice 词块
     * @return Result.success(list) 单词的精简信息
     */
    @GetMapping("/slice")
    public Result getSimpleWordmsg(String wordSlice) {
        List<SimpleWordmsg> list = new ArrayList<SimpleWordmsg>();
        list = wordmsgService.getSimpleWordmsg(wordSlice);
        if (list.isEmpty()) return Result.error("查询失败");
        return Result.success(list);
    }

}
