package com.example.wordbook.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 完整的wordmsg信息类
 * 包含了这个单词相关的所有属性
 * @author 赵俊宇
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wordmsg {
    private int id;
    private String word;
    private String phonetic;
    private String definition;
    private String translation;
    private String detail;
}
