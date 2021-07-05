package cn.edu.ecut.controller;

import cn.edu.ecut.service.impl.BannerServiceImpl;
import cn.edu.ecut.service.impl.MusicServiceImpl;
import cn.edu.ecut.service.impl.PlaylistServiceImpl;
import cn.edu.ecut.service.impl.ToplistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class ControllerM {

    @Autowired
    private MusicServiceImpl musicService;
     @Autowired
    private BannerServiceImpl bannerService;
     @Autowired
    private PlaylistServiceImpl playlistService;
     @Autowired
    private ToplistServiceImpl toplistService;

    @GetMapping("/index/{url}")
    public String index(@PathVariable String url,Map<String,String> map) {
        map.put("url",url+"/table");
        return "index";
    }


}
