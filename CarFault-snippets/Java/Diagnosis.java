public class Diagnosis {

    private int id;
    private String img;
    private String date;
    private String detectedIssues;
    private String maintenanceSuggestion;
    private String partName;

    // Constructor
    public Diagnosis(int id, String img, String date, String detectedIssues,
                     String maintenanceSuggestion, String partName) {
        this.id = id;
        this.img = img;
        this.date = date;
        this.detectedIssues = detectedIssues;
        this.maintenanceSuggestion = maintenanceSuggestion;
        this.partName = partName;
    }

    // Getters
   public int getId() {
    return id;
}

public String getImg() {
    return img;
}

public String getDate() {
    return date;
}

public String getDetectedIssues() {
    return detectedIssues;
}

public String getMaintenanceSuggestion() {
    return maintenanceSuggestion;
}

public String getPartName() {
    return partName;
}