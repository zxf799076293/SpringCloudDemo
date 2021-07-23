package com.snow.oauserconsume.test.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.snow.oauserconsume.entity.User;
import com.snow.oauserconsume.mapper.TestTableMapper;
import com.snow.oauserconsume.test.entity.TestTable;
import com.snow.oauserconsume.test.service.ITestTableService;
import com.snow.oauserconsume.test.service.impl.TestTableServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author snowfly
 * @since 2021-07-07
 */
@RestController
@RequestMapping("/test/test-table")
public class TestTableController {
    @Autowired
    private ITestTableService service;

    @ApiOperation(value = "获取测试表中的数据", notes = "", httpMethod = "GET")
    @RequestMapping(value = "/list")
    public List<TestTable> list() {
        List<TestTable> list = new ArrayList<>();
        list = service.list();
        return list;
    }

    @ApiOperation(value = "插入测试表数据", notes = "", httpMethod = "POST")
    @RequestMapping(value = "/save")
    public TestTable testTable() {
       TestTable testTable = new TestTable();
       testTable.setFirst("first2");
       testTable.setLast("last2");
       testTable.setPlaceofbirth("20");
       testTable.setDateofbirth(LocalDate.now());
       boolean success = service.save(testTable);
        if (success) {
            return testTable;
        } else {
            return null;
        }
    }

    @ApiOperation(value = "获取测试表中的数据分页", notes = "", httpMethod = "GET")
    @RequestMapping(value = "/list-page")
    public Object listPage() {
        IPage<TestTable> page = new Page<>(1, 2);
        QueryWrapper<TestTable> wrapper = new QueryWrapper<>();
        return service.page(page, wrapper);
    }
}
