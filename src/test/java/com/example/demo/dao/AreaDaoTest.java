package com.example.demo.dao;

import com.example.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    @Ignore
    public void queryArea() {
        List<Area> ll =areaDao.queryArea();
        assertEquals(4,ll.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        Area l = areaDao.queryAreaById(1);
        assertEquals("东",l.getName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area a = new Area();
        a.setName("哈哈");
        a.setPriority(5);
        int effectedNum = areaDao.insertArea(a);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area a = new Area();
        a.setName("西苑");
        a.setId(3);
        a.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(a);
        assertEquals(1,effectedNum);
    }

    @Test
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(5);
        assertEquals(1,effectedNum);
    }
}