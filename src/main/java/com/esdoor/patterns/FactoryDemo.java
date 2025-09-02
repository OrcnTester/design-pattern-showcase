package com.esdoor.patterns.factory;

interface Renderer {
    String render(String title, String body);
}

class PdfRenderer implements Renderer {
    public String render(String title, String body) {
        return "[PDF]\n# " + title + "\n" + body + "\n";
    }
}

class HtmlRenderer implements Renderer {
    public String render(String title, String body) {
        return "<html><h1>" + title + "</h1><p>" + body + "</p></html>";
    }
}

class RendererFactory {
    public static Renderer get(String type) {
        switch (type.toLowerCase()) {
            case "pdf":  return new PdfRenderer();
            case "html": return new HtmlRenderer();
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Renderer r1 = RendererFactory.get("pdf");
        Renderer r2 = RendererFactory.get("html");
        System.out.println(r1.render("Contract", "Content..."));
        System.out.println(r2.render("Contract", "Content..."));
    }
}
