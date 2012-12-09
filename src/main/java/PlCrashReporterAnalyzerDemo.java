package com.wyntersoft.crashreporteranaylzerdemo;

import com.wyntersoft.crashreporteranalyzer.*;

/**
 * Created with IntelliJ IDEA.
 * User: dwarren
 * Date: 11/25/12
 * Time: 11:50 AM
 */
public class PlCrashReporterAnalyzerDemo {
    public static void main(String args[])
    {
        try {
            PlCrashReporterAnalyzer analyzer = new PlCrashReporterAnalyzer("/Users/dwarren/development/PlCrashReporterAnalyzerDemo/src/main/resources/live_report.plcrash");
            System.out.println(analyzer.getCrashReport());
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
