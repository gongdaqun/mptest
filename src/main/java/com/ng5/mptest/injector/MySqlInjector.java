package com.ng5.mptest.injector;
import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.mapper.AutoSqlInjector;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/16
 */
public class MySqlInjector extends AutoSqlInjector{
    @Override
    protected void injectSelectByIdSql(boolean batch, Class<?> mapperClass, Class<?> modelClass, TableInfo table) {
        System.out.println("into inject select by id");
        super.injectSelectByIdSql(batch, mapperClass, modelClass, table);
    }

    @Override
    public void inject(Configuration configuration, MapperBuilderAssistant builderAssistant, Class<?> mapperClass, Class<?> modelClass, TableInfo table) {
        // 构造sql语句
        String sql = "delete from " + table.getTableName();
        // 构造方法名
        String method = "deleteAll";
        // 构造SqlSource对象
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
        // 构造一个删除的MapperStatement
        this.addDeleteMappedStatement(mapperClass,method,sqlSource);
    }
}
