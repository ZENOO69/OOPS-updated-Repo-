interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String t) { System.out.println("Image Filter: " + t); }
    public void reset_filter() { System.out.println("Image Reset"); }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String t) { System.out.println("Data Filter: " + t); }
    public void reset_filter() { System.out.println("Data Reset"); }
}
