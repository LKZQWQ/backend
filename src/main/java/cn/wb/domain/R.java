package cn.wb.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Unified return results
 *
 * @author Helios
 * Time：2023-11-23 21:38
 */
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {
    /**
     * status code
     */
    private Integer code;
    /**
     * return information
     */
    private String msg;
    /**
     * return data
     */
    private T data;

    /**
     * successfully returned results
     *
     * @return R
     */
    public static <Void> R<Void> ok() {
        return new R<Void>(200, "success", null);
    }

    /**
     * successfully returned results
     *
     * @param data return data
     * @return R
     */
    public static <T> R<T> ok(T data) {
        return new R<T>(200, "success", data);
    }

    /**
     * failed to return results
     *
     * @param msg error message
     * @return R
     */
    public static <Void> R<Void> error(String msg) {
        return new R<Void>(500, msg, null);
    }

    /**
     * failed to return results
     *
     * @return R
     */
    public static <Void> R<Void> error() {
        return new R<Void>(500, "backend service error!", null);
    }

    /**
     * failed to return results
     *
     * @param code error code
     * @param msg  error message
     * @return R
     */
    public static <Void> R<Void> error(Integer code, String msg) {
        return new R<Void>(code, msg, null);
    }

}
