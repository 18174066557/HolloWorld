package cn.edu.ecut.service;

import cn.edu.ecut.entity.Toplist;
import cn.edu.ecut.vo.DataVO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ecut
 * @since 2021-07-03
 */
public interface ToplistService extends IService<Toplist> {
    public DataVO<Toplist> findData(Integer page, Integer limit);
}
