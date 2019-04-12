package annotations.a1;

import java.lang.reflect.Field;

public class SortableField {

    public SortableField(FieldMeta meta, Field field) {
        this.meta = meta;
        this.field = field;
        this.name = name;
    }

    public SortableField(FieldMeta meta, String name, Class<?> type) {
        this.meta = meta;
        this.field = field;
        this.name = name;
        this.type = type;
    }

    public FieldMeta getMeta() {
        return meta;
    }

    public void setMeta(FieldMeta meta) {
        this.meta = meta;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    private FieldMeta meta;
    private Field field;
    private String name;
    private Class<?> type;

}
