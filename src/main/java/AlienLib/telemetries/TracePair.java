package AlienLib.telemetries;

public class TracePair<T> {
  public TracePair(String columnName, T value) {
    m_columnName = columnName;
    m_value = value;
  }

  public String getColumnName() {
    return m_columnName;
  }

  public T getValue() {
    return m_value;
  }

  private String m_columnName;
  private T m_value;
}
