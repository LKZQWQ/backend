package cn.wb.controller;

import cn.wb.domain.R;
import cn.wb.domain.bo.DemoBo;
import cn.wb.service.IDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * exampleController
 * Note that the Restful style is used
 * GET：query
 * POST：add
 * PUT：modify
 * DELETE：delete
 *
 * @author Helios
 * Time：2023-11-23 21:24
 */
@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {
    private final IDemoService demoService;

    /**
     * query example
     *
     * @param bo DemoBo
     * @return exampleVo
     */
    @GetMapping()
    public R<?> queryDemo(DemoBo bo) {
        return R.ok(demoService.queryDemo(bo));
    }

    /**
     * new example
     *
     * @param bo DemoBo
     * @return R
     */
    @PostMapping()
    public R<?> addDemo(DemoBo bo) {
        return R.ok(demoService.saveByBo(bo));
    }


}
