package structural.adapter_pattern;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Este adaptador lo creamos para hacer compatible HsqlAccessor con DbType
 */
public class HsqlAdapter implements DbType{
    private HsqlAccessor hsqlAccessor;
    public HsqlAccessor getHsqlAccessor() {
        return hsqlAccessor;
    }
    public void setHsqlAccessor(HsqlAccessor hsqlAccessor) {
        this.hsqlAccessor = hsqlAccessor;
    }
    @Override
    public int update(String query, String[] parameters) {
        return this.getHsqlAccessor().update(query, Arrays.asList(parameters));
    }
    @Override
    public List<String> query(String query, String[] parameters) {
        ResultSet resultSet = this.getHsqlAccessor().select(query, Arrays.asList(parameters));
        return convertResultSet(resultSet);
    }
    public List<String> convertResultSet(ResultSet rs) {
        List<String> list = new ArrayList();
        return list;
    }

}
