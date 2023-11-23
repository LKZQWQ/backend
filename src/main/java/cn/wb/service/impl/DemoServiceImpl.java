package cn.wb.service.impl;

import cn.wb.domain.Demo;
import cn.wb.domain.bo.DemoBo;
import cn.wb.mapper.DemoMapper;
import cn.wb.service.IDemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Helios
 * Time：2023-11-23 21:36
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements IDemoService {
    @Override
    public Object queryDemo(DemoBo bo) {
        //write business logic here
        return null;
    }

    @Override
    public Object saveByBo(DemoBo bo) {
        return null;
    }
}
