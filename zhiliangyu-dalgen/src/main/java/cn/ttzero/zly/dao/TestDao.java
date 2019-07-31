package cn.ttzero.zly.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import cn.ttzero.zly.model.Test;
import cn.ttzero.zly.mapper.TestMapper;

/**
* The Table TEST.
* 注意:此结构由系统生成, 禁止手工修改以免被覆盖, 请通过bree-mybatis插件生成
 * @author wangguanquan
*/
@Repository
public class TestDao {

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
    public int deleteByPrimary(Integer id) {
        return testMapper.deleteByPrimary(id);
    }

    /**
     * 根据主键获取数据:TEST.
     * @param id id
     * @return Test
     */
    public Test getByPrimary(Integer id) {
        return testMapper.getByPrimary(id);
    }
}
