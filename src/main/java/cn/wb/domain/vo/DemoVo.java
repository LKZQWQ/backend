package cn.wb.domain.vo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The VO package of the sample entity class
 * Data objects passed to the front-end
 *
 * @author Helios
 * Time：2023-11-23 21:29
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class DemoVo {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
}
