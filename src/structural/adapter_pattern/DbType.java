package structural.adapter_pattern;

import java.util.List;

public interface DbType {
    public List<String> query(String query, String[] parameters);
    public int update(String query, String[] parameters);
}



