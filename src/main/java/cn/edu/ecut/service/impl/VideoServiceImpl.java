package cn.edu.ecut.service.impl;

import cn.edu.ecut.entity.Video;
import cn.edu.ecut.mapper.VideoMapper;
import cn.edu.ecut.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ecut
 * @since 2021-07-03
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
