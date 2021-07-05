package cn.edu.ecut.service.impl;

import cn.edu.ecut.entity.Toplist;
import cn.edu.ecut.mapper.ToplistMapper;
import cn.edu.ecut.service.ToplistService;
import cn.edu.ecut.vo.DataVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ecut
 * @since 2021-07-03
 */
@Service
public class ToplistServiceImpl extends ServiceImpl<ToplistMapper, Toplist> implements ToplistService {

    @Autowired
    private ToplistMapper toplistMapper;

    public DataVO<Toplist> findData(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();

        dataVO.setCode(0);
        dataVO.setMsg("");

        //分页
        IPage<Toplist> toplistPage = new Page<Toplist>(page, limit);
        IPage<Toplist> res = toplistMapper.selectPage(toplistPage, null);

        dataVO.setCount(res.getTotal());
        List<Toplist> list = res.getRecords();

        dataVO.setData(list);
        return dataVO;
    }
}
