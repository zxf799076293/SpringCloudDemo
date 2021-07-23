package com.snow.oauserconsume.test.service.impl;

import com.snow.oauserconsume.test.entity.TestTable;
import com.snow.oauserconsume.mapper.TestTableMapper;
import com.snow.oauserconsume.test.service.ITestTableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author snowfly
 * @since 2021-07-07
 */
@Service
public class TestTableServiceImpl extends ServiceImpl<TestTableMapper, TestTable> implements ITestTableService {

}
