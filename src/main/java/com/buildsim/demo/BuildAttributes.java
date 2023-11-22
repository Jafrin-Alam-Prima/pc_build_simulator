package com.buildsim.demo;

public class BuildAttributes {
    private String monitorBrand;
    private String processorBrand;
    private String motherboardBrand;
    private String ramBrand;
    private String hddBrand;

    // Constructors, getters, and setters

    public BuildAttributes() {
    }

    public BuildAttributes(String monitorBrand, String processorBrand, String motherboardBrand, String ramBrand, String hddBrand) {
        this.monitorBrand = monitorBrand;
        this.processorBrand = processorBrand;
        this.motherboardBrand = motherboardBrand;
        this.ramBrand = ramBrand;
        this.hddBrand = hddBrand;
    }

    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public String getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(String processorBrand) {
        this.processorBrand = processorBrand;
    }

    public String getMotherboardBrand() {
        return motherboardBrand;
    }

    public void setMotherboardBrand(String motherboardBrand) {
        this.motherboardBrand = motherboardBrand;
    }

    public String getRamBrand() {
        return ramBrand;
    }

    public void setRamBrand(String ramBrand) {
        this.ramBrand = ramBrand;
    }

    public String getHddBrand() {
        return hddBrand;
    }

    public void setHddBrand(String hddBrand) {
        this.hddBrand = hddBrand;
    }
}