package cn.ttzero.zly.service.impl;

import cn.ttzero.zly.model.Test;
import java.util.Map;
import java.util.List;
import cn.ttzero.zly.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import cn.ttzero.zly.mapper.TestMapper;

/**
* The Table TEST.
* 注意:此结构由系统生成, 禁止手工修改以免被覆盖, 请通过bree-mybatis插件生成
 * @author ext.wangguanquan
*/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    /**
     * 插入表:TEST.
     * @param entity entity
     * @return int
     */
    public int insert(Test entity) {
        return testMapper.insert(entity);
    }

    /**
     * 更新表:TEST.
     * @param entity entity
     * @return int
     */
    public int update(Test entity) {
        return testMapper.update(entity);
    }

    /**
     * 根据主键删除数据:TEST.
     * @param id id
     * @return int
     */
    public int deleteById(Integer id) {
        return testMapper.deleteById(id);
    }

    /**
     * 根据主键获取数据:TEST.
     * @param id id
     * @return Test
     */
    public Test getById(Integer id) {
        return testMapper.getById(id);
    }

    /**
     * Map testing.
     * @param map map
     * @return List<Test>
     */
    public List<Test> queryByMap(Map<String, ?> map) {
        return testMapper.queryByMap(map);
    }
}
