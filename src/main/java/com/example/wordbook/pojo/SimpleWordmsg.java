package com.example.wordbook.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleWordmsg {
    private int id;
    private String word;
    private String translation;

}
