package mydataharbor.plugin.sink.jdbc.mysql;

import mydataharbor.source.jdbc.JdbcDataSource;

/**
 * Created by xulang on 2021/8/19.
 */
public class JdbcMysql80xDataSource extends JdbcDataSource {

  public JdbcMysql80xDataSource(JdbcDataSourceConfig jdbcDataSourceConfig) {
    super(jdbcDataSourceConfig);
  }

  @Override
  public String driverClassName() {
    return "com.mysql.cj.jdbc.Driver";
  }

  @Override
  public String dataSourceType() {
    return super.dataSourceType() + "mysql-8.0.x";
  }
}
