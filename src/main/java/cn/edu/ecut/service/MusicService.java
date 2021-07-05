package cn.edu.ecut.service;

import cn.edu.ecut.entity.Music;
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
public interface MusicService extends IService<Music> {
    public DataVO<Music> findData(Integer page, Integer limit);
    public DataVO<Music> search(Integer page, Integer limit,String key);

}
