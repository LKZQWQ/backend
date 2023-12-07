package com.example.wordbook.mapper;

import com.example.wordbook.pojo.SimpleWordmsg;
import com.example.wordbook.pojo.Wordmsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MyBatis Mapper接口，用于处理Wordmsg实体的数据库操作
 *
 * @author 赵俊宇
 * @date 2023/12/05
 */
@Mapper
public interface WordmsgMapper {
    @Select("select *  from wordmsg where word = #{word}")
    Wordmsg getWordmsg(String word);

    List<SimpleWordmsg> getSimpleWordmsg(String word);
}
