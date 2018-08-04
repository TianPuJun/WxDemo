package com.example.demo.web;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    private final AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping("/listarea")
    private Map<String,Object> listArea(){
        Map<String,Object> modeMap = new HashMap<String,Object>();
        List<Area> list = areaService.getAreaList();
        modeMap.put("areaList",list);
        return modeMap;
    }
    @GetMapping("getareabyid")
    private Map<String,Object> getAreaById(Integer id){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        Area area = areaService.getAreaById(id);
        modelMap.put("area",area);
        return modelMap;
    }
    @PostMapping("/addarea")
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modeMap = new HashMap<String,Object>();
        modeMap.put("success",areaService.addArea(area));
        return modeMap;
    }
    @PostMapping("/modifyarea")
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modeMap = new HashMap<String,Object>();
        //修改区域信息
        modeMap.put("success",areaService.modifyArea(area));
        return modeMap;
    }
    @GetMapping("/removearea")
    private Map<String,Object> removeArea(Integer id){
        Map<String,Object> modeMap = new HashMap<String,Object>();
        //修改区域信息
        modeMap.put("success",areaService.deleteArea(id));
        return modeMap;
    }
}
