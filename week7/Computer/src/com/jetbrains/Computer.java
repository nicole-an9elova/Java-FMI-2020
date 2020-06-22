package com.jetbrains;

public class Computer {
    private String type;
    private double procSpeed;
    private String[] files;

    public Computer(String type, double procSpeed, String[] files) {
        setFiles(files);
        setProcSpeed(procSpeed);
        setType(type);
    }

    public Computer() {
        this("", 0.0, new String[]{""});
    }

    public Computer(Computer comp) {
        this(comp.getType(), comp.getProcSpeed(), comp.getFiles());
    }

    public String getType() {
        return this.type;
    }

    public double getProcSpeed() {
        return this.procSpeed;
    }

    public String[] getFiles() {
        String[] copy = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            copy[i] = files[i];
        }
        return copy;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        } else {
            this.type = "";
        }
    }

    public void setProcSpeed(double procSpeed) {
        if (procSpeed > 0) {
            this.procSpeed = procSpeed;
        } else {
            this.procSpeed = 0.0;
        }
    }

    public void setFiles(String[] files) {
        if (files != null) {
            this.files = new String[files.length];
            for (int i = 0; i < files.length; i++) {
                this.files[i] = files[i];
            }
        } else {
            this.files = new String[]{""};
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < files.length; i++) {
            result += String.format("File: %d - %s\n", i, files[i]);
        }
        return String.format("Type: %s \n" +
                "Processor Speed: %s \n", type, procSpeed) + result;
    }
}
