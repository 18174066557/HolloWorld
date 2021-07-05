package cn.edu.ecut.controller;


import cn.edu.ecut.entity.Toplist;
import cn.edu.ecut.service.impl.ToplistServiceImpl;
import cn.edu.ecut.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ecut
 * @since 2021-07-03
 */
@Controller
@RequestMapping("//toplist")
public class ToplistController {
    @Autowired
    private ToplistServiceImpl toplistService;

    @GetMapping("/table")
    public String table() {
        return "toplist";
    }

    @GetMapping("/list")
    @ResponseBody
    public DataVO<Toplist> tableV(Integer page, Integer limit) {
        return toplistService.findData(page,limit);
    }

    @DeleteMapping("/delete")
    public void delete(String id){
        System.out.println(id);
    }

    @PutMapping("/update")
    public void update(Toplist toplist){
        toplistService.update(toplist,null);
    }



}

