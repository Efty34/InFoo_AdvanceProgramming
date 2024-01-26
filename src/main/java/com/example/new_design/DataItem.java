package com.example.new_design;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DataItem {
    private final StringProperty field;
    private final StringProperty value;

    public DataItem(String field, String value) {
        this.field = new SimpleStringProperty(field);
        this.value = new SimpleStringProperty(value);
    }

    public String getField() {
        return field.get();
    }

    public String getValue() {
        return value.get();
    }

    public StringProperty fieldProperty() {
        return field;
    }

    public StringProperty valueProperty() {
        return value;
    }
}
