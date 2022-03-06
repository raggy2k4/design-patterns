package com.company.builder.document;

public class DocumentCategory {
    public final String name;

    public DocumentCategory(String name) {
        this.name = name;
    }

    public static DocumentCategory of(String name) {
        return new DocumentCategory(name);
    }

    public String toString() {
        return "DocumentCategory(name=" + this.name + ")";
    }
}
