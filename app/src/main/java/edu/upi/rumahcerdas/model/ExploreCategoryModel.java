package edu.upi.rumahcerdas.model;

import java.util.ArrayList;

public class ExploreCategoryModel extends ExploreModel {
    private ArrayList<ExploreSubcategoryModel> subcategories;

    public ArrayList<ExploreSubcategoryModel> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(ArrayList<ExploreSubcategoryModel> subcategories) {
        this.subcategories = subcategories;
    }

    public ExploreCategoryModel(String name, ArrayList<ExploreSubcategoryModel> subcategories) {
        this.name = name;
        this.subcategories = subcategories;
    }
}

