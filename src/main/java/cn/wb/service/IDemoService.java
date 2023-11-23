package cn.wb.service;

import cn.wb.domain.Demo;
import cn.wb.domain.bo.DemoBo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * service interface
 *
 * @author Helios
 * Time：2023-11-23 21:34
 */
public interface IDemoService extends IService<Demo> {
    Object queryDemo(DemoBo bo);

    Object saveByBo(DemoBo bo);
}
