package cn.edu.ecut.controller;


import cn.edu.ecut.entity.Music;
import cn.edu.ecut.service.impl.MusicServiceImpl;
import cn.edu.ecut.vo.DataVO;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ecut
 * @since 2021-07-03
 */
@Controller
@RequestMapping("//music")
public class MusicController {
    @Autowired
    private MusicServiceImpl musicService;

    @GetMapping("/table")
    public String table() {
        return "music";
    }

    @GetMapping("/list")
    @ResponseBody
    public DataVO<Music> tableV(Integer page, Integer limit) {
        return musicService.findData(page,limit);
    }

    @GetMapping("/search")
    @ResponseBody
    public DataVO<Music> search(Integer page, Integer limit,String key) {
        System.out.println(key);
         return musicService.search(page,limit,key);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void delete(Music music){
        System.out.println(music);
        musicService.deleteById(Long.parseLong(music.getMusicid()));
    }

    @PutMapping("/update")
    @ResponseBody
    public void update(Music music){
        musicService.update(music);
    }

    @PostMapping("/save")
    @ResponseBody
    public void save(Music music){
        musicService.save(music);
    }

    @DeleteMapping("/deletecheck")
    @ResponseBody
    public void deleteCheck(@RequestParam("list")String check){
        //jackson对象
        ObjectMapper mapper = new ObjectMapper();
        //使用jackson将json转为List<Music>
        JavaType jt = mapper.getTypeFactory().constructParametricType(ArrayList.class, Music.class);
        List<Music> list=new ArrayList<>();
        try{
            list =  (List<Music>)mapper.readValue(check, jt);
        }catch (Exception e){
            e.printStackTrace();
        }
        musicService.deletecheck(list);
    }
    @DeleteMapping("/updatechecklistid")
    @ResponseBody
    public void updatechecklistid(@RequestParam("list")String check)throws Exception{
        //jackson对象
        ObjectMapper mapper = new ObjectMapper();
        //使用jackson将json转为List<Music>
        JavaType jt = mapper.getTypeFactory().constructParametricType(ArrayList.class, Music.class);
        List<Music> list =  (List<Music>)mapper.readValue(check, jt);
        list.forEach(System.out::println);
    }
}

