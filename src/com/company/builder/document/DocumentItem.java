package com.company.builder.document;

import java.util.List;

public class DocumentItem {
    private String title;
    private DocumentCategory category;
    private List<String> signatures;

    private DocumentItem(String title, DocumentCategory category, List<String> signatures) {
        this.title = title;
        this.category = category;
        this.signatures = signatures;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DocumentCategory getCategory() {
        return category;
    }

    public void setCategory(DocumentCategory category) {
        this.category = category;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    @Override
    public String toString() {
        return "DocumentItem{" +
                "title='" + title + '\'' +
                ", category=" + category +
                ", signatures=" + signatures +
                '}';
    }

    public static final class DocumentItemBuilder {
        private String title;
        private DocumentCategory category;
        private List<String> signatures;

        private DocumentItemBuilder(String title, DocumentCategory category, List<String> signatures) {
            this.title = title;
            this.category = category;
            this.signatures = signatures;
        }

        public static DocumentItemBuilder aDocumentItem(String title, DocumentCategory category, List<String> signatures) {
            return new DocumentItemBuilder(title, category, signatures);
        }

        public DocumentItem build() {
            DocumentItem documentItem = new DocumentItem(title, category, signatures);
            return documentItem;
        }
    }
}
