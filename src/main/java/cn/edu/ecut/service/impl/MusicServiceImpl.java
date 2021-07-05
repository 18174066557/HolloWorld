package cn.edu.ecut.service.impl;

import cn.edu.ecut.entity.Music;
import cn.edu.ecut.mapper.MusicMapper;
import cn.edu.ecut.service.MusicService;
import cn.edu.ecut.vo.DataVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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
public class MusicServiceImpl extends ServiceImpl<MusicMapper, Music> implements MusicService {
    @Autowired
    private MusicMapper musicMapper;

    public DataVO<Music> findData(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();

        dataVO.setCode(0);
        dataVO.setMsg("");

        //分页
        IPage<Music> musicPage = new Page<Music>(page, limit);
        IPage<Music> res = musicMapper.selectPage(musicPage, null);

        dataVO.setCount(res.getTotal());
        List<Music> list = res.getRecords();

        dataVO.setData(list);
        return dataVO;
    }

    public DataVO<Music> search(Integer page, Integer limit,String key) {
        DataVO dataVO = new DataVO();

        dataVO.setCode(0);
        dataVO.setMsg("");

        QueryWrapper<Music> wrapper= Wrappers.query();
        wrapper.like("name",key);
        //分页
        IPage<Music> musicPage = new Page<Music>(page, limit);
        IPage<Music> res = musicMapper.selectPage(musicPage, wrapper);

        dataVO.setCount(res.getTotal());
        List<Music> list = res.getRecords();

        dataVO.setData(list);
        return dataVO;
    }

    public void deleteById(Long id){
        musicMapper.deleteById(id);
    }
    public void deletecheck(List<Music> list){
        for(Music mu:list)
            musicMapper.deleteById(mu.getMusicid());
    }

    public void update(Music music){
        musicMapper.updateById(music);
    }
    public void updateListId(List<Music> list){
        for(Music mu:list){
           musicMapper.updateById(mu);
        }
    }
}
