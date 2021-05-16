package structural.adapter_pattern;

import java.sql.ResultSet;
import java.util.List;

public interface HsqlAccessor {
    public ResultSet select(String query, List<String> parametrs);
    public int update(String query, List<String> parameters);
}
