package com.example.wordbook.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {
    private int id;
    private String word;
    private String translation;
    private int userId;
}
