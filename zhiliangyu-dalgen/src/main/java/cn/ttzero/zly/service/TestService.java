package cn.ttzero.zly.service;

import cn.ttzero.zly.model.Test;
import java.util.Map;
import java.util.List;

/**
* The Table TEST.
* 注意:此结构由系统生成, 禁止手工修改以免被覆盖, 请通过bree-mybatis插件生成
 * @author ext.wangguanquan
*/
public interface TestService {
    /**
     * 插入表:TEST.
     * @param entity entity
     * @return int
     */
    int insert(Test entity);
    /**
     * 更新表:TEST.
     * @param entity entity
     * @return int
     */
    int update(Test entity);
    /**
     * 根据主键删除数据:TEST.
     * @param id id
     * @return int
     */
    int deleteById(Integer id);
    /**
     * 根据主键获取数据:TEST.
     * @param id id
     * @return Test
     */
    Test getById(Integer id);
    /**
     * Map testing.
     * @param map map
     * @return List<Test>
     */
    List<Test> queryByMap(Map<String, ?> map);
}
