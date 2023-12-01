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

@RestController
@RequestMapping("/search")
public class WordmsgController {

    @Autowired
    private WordmsgService wordmsgService;

    @GetMapping
    public Result getWordmsg(String word) {
        Wordmsg wordmsg = wordmsgService.getWordmsg(word);
        if (wordmsg == null) return Result.error("查询失败");

        return Result.success(wordmsg);
    }

    @GetMapping("/slice")
    public Result getSimpleWordmsg(String wordSlice) {
        List<SimpleWordmsg> list = new ArrayList<SimpleWordmsg>();
        list = wordmsgService.getSimpleWordmsg(wordSlice);
        if (list.isEmpty()) return Result.error("查询失败");
        return Result.success(list);
    }

}
