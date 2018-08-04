package com.example.demo.dao;


import com.example.demo.entity.Area;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int id);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int id);
}
