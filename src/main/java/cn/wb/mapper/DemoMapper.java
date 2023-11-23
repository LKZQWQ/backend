package cn.wb.mapper;

import cn.wb.domain.Demo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * The mapper layer for interacting with databases
 *
 * @author Helios
 * Time：2023-11-23 21:31
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
}
