package com.gof.builder.demo1;

public class Product {

    private String BuilderA ;
    private String BuilderB;
    private String BuilderC;
    private String BuilderD;

    public String getBuilderA() {
        return BuilderA;
    }

    public void setBuilderA(String builderA) {
        BuilderA = builderA;
    }

    public String getBuilderB() {
        return BuilderB;
    }

    public void setBuilderB(String builderB) {
        BuilderB = builderB;
    }

    public String getBuilderC() {
        return BuilderC;
    }

    public void setBuilderC(String builderC) {
        BuilderC = builderC;
    }

    public String getBuilderD() {
        return BuilderD;
    }

    public void setBuilderD(String builderD) {
        BuilderD = builderD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "BuilderA='" + BuilderA + '\'' +
                ", BuilderB='" + BuilderB + '\'' +
                ", BuilderC='" + BuilderC + '\'' +
                ", BuilderD='" + BuilderD + '\'' +
                '}';
    }
}
