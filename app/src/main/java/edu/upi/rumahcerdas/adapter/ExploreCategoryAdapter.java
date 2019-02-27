package edu.upi.rumahcerdas.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import edu.upi.rumahcerdas.R;
import edu.upi.rumahcerdas.model.ExploreCategoryModel;

public class ExploreCategoryAdapter extends RecyclerView.Adapter<ExploreCategoryAdapter.ViewHolder> {
    private ArrayList<ExploreCategoryModel> categories;
    private Context context;

    private RecyclerView subcategoryContainer = null;

    public ExploreCategoryAdapter(ArrayList<ExploreCategoryModel> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.explore_container_category, viewGroup, false);

        final ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.setIsRecyclable(false);

        /*
         * Mendapatkan subkategori konten
         */
        subcategoryContainer = view.findViewById(R.id.subcategories_frequently_container);
        subcategoryContainer.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.categoryName.setText(categories.get(i).getName());

        subcategoryContainer.setAdapter(new ExploreSubcategoryAdapter(categories.get(i).getSubcategories(), context, i));
    }

    @Override
    public int getItemCount() {
        return categories == null ? 0 : categories.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView categoryName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryName = itemView.findViewById(R.id.category_name);
        }
    }
}
