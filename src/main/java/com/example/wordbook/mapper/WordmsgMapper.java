package com.example.wordbook.mapper;

import com.example.wordbook.pojo.SimpleWordmsg;
import com.example.wordbook.pojo.Wordmsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WordmsgMapper {
    @Select("select *  from wordmsg where word = #{word}")
    Wordmsg getWordmsg(String word);

    List<SimpleWordmsg> getSimpleWordmsg(String word);
}
