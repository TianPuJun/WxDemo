package com.example.demo.service;

import com.example.demo.entity.Area;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AreaService {

    List<Area> getAreaList ();
    Area getAreaById(int id);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int id);

}
