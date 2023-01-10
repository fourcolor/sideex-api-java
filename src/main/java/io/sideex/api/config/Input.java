package io.sideex.api.config;

import java.util.ArrayList;

public class Input {
    private ArrayList<String> testSuites = new ArrayList<String>();
    private ArrayList<String> variables = new ArrayList<String>();
    private ArrayList<String> dataDriven = new ArrayList<String>();

    public void setTestSuites(ArrayList<String> testSuites) {
        this.testSuites = testSuites;
    }

    public void setVariables(ArrayList<String> variables) {
        this.variables = variables;
    }

    public void setDataDriven(ArrayList<String> dataDriven) {
        this.dataDriven = dataDriven;
    }

    public ArrayList<String> getDataDriven() {
        return dataDriven;
    }

    public ArrayList<String> getTestSuites() {
        return testSuites;
    }

    public ArrayList<String> getVariables() {
        return variables;
    }
}
