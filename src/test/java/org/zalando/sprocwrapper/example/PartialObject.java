package org.zalando.sprocwrapper.example;

import org.zalando.typemapper.annotations.DatabaseField;
import org.zalando.typemapper.annotations.DatabaseType;

@DatabaseType(partial = true)
public class PartialObject {

    @DatabaseField
    private int id;
    @DatabaseField
    private String name;

    public void setId(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
