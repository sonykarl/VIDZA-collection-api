package com.example.vidza.features.utils;

public enum FIlePaths {
    F_ILE_PATHS;

    public String getfilePath(){
        switch (this) {
            case F_ILE_PATHS:
                return "src/main/resources/static/uploads/";

            default:
                return null;
        }
    }
}
