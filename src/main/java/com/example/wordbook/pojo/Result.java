package com.example.wordbook.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 传给前端的返回结果实体类
 *
 * @author 赵俊宇
 * @date 2023/12/05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;//响应码，200 代表成功; 404 代表失败
    private Object data; //返回的数据
    private String message;  //响应信息 描述字符串

    //增删改 成功响应
    public static Result success() {
        return new Result(200, null, "success");
    }

    //查询 成功响应
    public static Result success(Object data) {
        return new Result(200, data, "success");
    }

    //失败响应
    public static Result error(String msg) {
        return new Result(404, null, msg);
    }
}