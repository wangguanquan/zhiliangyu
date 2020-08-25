package cn.ttzero.zly.model;

import org.apache.ibatis.annotations.Mapper;

/**
 * The table TEST
 * 注意: 此结构由系统生成, 禁止手工修改以免被覆盖, 请通过bree-mybatis插件生成
 *
 * @author ext.wangguanquan
 */
@Mapper
public class Test {

    /**
     * The name .
     */
    private String name;

    /**
     * Setting the name .
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the name .
     *
     * @return the name value
     */
    public String getName() {
        return name;
    }
}
