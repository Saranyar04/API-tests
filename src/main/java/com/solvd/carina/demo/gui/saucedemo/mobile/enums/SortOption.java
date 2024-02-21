package com.solvd.carina.demo.gui.saucedemo.mobile.enums;

public enum SortOption {

    A_TO_Z_FILTER("Name (A to Z)"),
    Z_TO_A_FILTER("Name (Z to A)"),
    LOW_TO_HIGH_FILTER("Price (low to high)"),
    HIGH_TO_LOW_FILTER("Price (high to low)"),
    CANCEL_BUTTON("Cancel");

    private final String sortOption;

    SortOption(String sortOption) {
        this.sortOption = sortOption;
    }

    public String getSortOption() {
        return sortOption;
    }

}
