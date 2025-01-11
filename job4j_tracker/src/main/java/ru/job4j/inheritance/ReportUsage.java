package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        TextReport jsonReport = new JSONReport();
        textReport.generate("name", "body");
        jsonReport.generate("name", "body");
    }
}