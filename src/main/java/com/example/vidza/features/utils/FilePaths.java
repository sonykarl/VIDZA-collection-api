package com.example.vidza.features.utils;

public enum FilePaths {
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
