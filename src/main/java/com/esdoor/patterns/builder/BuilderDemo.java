package com.esdoor.patterns.builder;

class PdfDoc {
    private final String title;
    private final String body;
    private final String footer;
    private PdfDoc(Builder b) {
        this.title = b.title;
        this.body = b.body;
        this.footer = b.footer;
    }
    public static class Builder {
        private String title;
        private String body;
        private String footer;
        public Builder title(String v) { this.title = v; return this; }
        public Builder body(String v) { this.body = v; return this; }
        public Builder footer(String v) { this.footer = v; return this; }
        public PdfDoc build() { return new PdfDoc(this); }
    }
    public String render() {
        return "[PDF]\n# " + title + "\n" + body + "\n-- " + footer;
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        PdfDoc doc = new PdfDoc.Builder()
                .title("Sales Contract")
                .body("Agreement between A and B...")
                .footer("ESDOOR • IBAN: TR...")
                .build();
        System.out.println(doc.render());
    }
}
