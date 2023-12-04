package com.example.wordbook.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 简化的wordmsg信息类
 *
 * @author 赵俊宇
 * @date 2023/12/05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleWordmsg {
    private int id;
    private String word;
    private String translation;

}
