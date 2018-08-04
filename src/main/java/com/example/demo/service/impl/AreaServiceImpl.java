package com.example.demo.service.impl;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;
import org.hibernate.validator.constraints.LuhnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    private final AreaDao areaDao;

    @Autowired
    public AreaServiceImpl(AreaDao areaDao) {
        this.areaDao = areaDao;
    }

    @Override
    public List<Area> getAreaList() {
        return  this.areaDao.queryArea();
    }

    @Override
    @LuhnCheck(ignoreNonDigitCharacters = true)
    public Area getAreaById(int id) {
        //int a = 1/0;
        return this.areaDao.queryAreaById(id);
    }
    @Transactional
    @Override
    public boolean addArea(Area area) {
        if (area.getName()!=null && !"".equals(area.getName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectNum = areaDao.insertArea(area);
                if (effectNum >0){
                    return true;
                }else{
                    throw new RuntimeException("插入区域信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败"+e.getMessage());
            }
        }else{
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        if (area.getId()!=null && !"".equals(area.getId())){
           area.setLastEditTime(new Date());
        try {
            int effectNum = areaDao.updateArea(area);
            if (effectNum >0){
                return true;
            }else{
                throw new RuntimeException("更新区域信息失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("更新区域信息失败！"+e.toString());
        }

        }else{
            throw new RuntimeException("区域信息不能为空！");
        }

    }

    @Override
    public boolean deleteArea(int id) {
        if (id>0){
            try {
                int effectNum = areaDao.deleteArea(id);
                if (effectNum >0){
                    return true;
                }else{
                    throw new RuntimeException("删除区域信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除区域信息失败！"+e.toString());
            }
        }else{
            throw new RuntimeException("区域id不能为空！");
        }

    }
}
