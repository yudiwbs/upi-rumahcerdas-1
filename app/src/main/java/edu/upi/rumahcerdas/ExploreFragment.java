package edu.upi.rumahcerdas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import edu.upi.rumahcerdas.adapter.ExploreCategoryAdapter;
import edu.upi.rumahcerdas.model.ExploreCategoryModel;
import edu.upi.rumahcerdas.model.ExploreSubcategoryModel;


public class ExploreFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public ExploreFragment() {
        // Required empty public constructor
    }

    public static ExploreFragment newInstance() {
        ExploreFragment fragment = new ExploreFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        /*
         * Mendapatkan konten highlight
         */
        int NUMBER_OF_HIGHLIGHTS = 6;

        CarouselView highlightsContainer = view.findViewById(R.id.highlights_container);
        highlightsContainer.setPageCount(NUMBER_OF_HIGHLIGHTS);
        highlightsContainer.setViewListener(new ViewListener() {
            @Override
            public View setViewForPosition(final int position) {
                @SuppressLint("InflateParams") View content_highlight = getLayoutInflater().inflate(R.layout.explore_container_highlight, null);

                /*
                 * Mengeset isi konten
                 */
//                ImageView contentImageBackground = content_highlight.findViewById(R.id.image_background);
//                contentImageBackground.setImageResource(R.drawable.sample_image);

                // Mengeset color filter gambar latar
                // untuk memudahkan pengguna membaca teks abstrak
//                contentImageBackground.setColorFilter(adjustAlpha(
//                        getDominantColor(
//                                BitmapFactory.decodeResource(
//                                        Objects.requireNonNull(getContext()).getResources(),
//                                        R.drawable.sample_image)),
//                        0.5f
//                ));
//                contentImageBackground.setColorFilter(
//                        adjustAlpha(
//                                ContextCompat.getColor(
//                                        Objects.requireNonNull(getContext()),
//                                        R.color.colorPrimary
//                                ),
//                                0.6f
//                        )
//                );

                TextView contentAbstract = content_highlight.findViewById(R.id.text_description);
                contentAbstract.setText("Lorem ipsum dolor sit amet, ullum populo...");

                /*
                 * Mengeset onClickListener konten
                 */
                content_highlight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "Clicked item: " + position, Toast.LENGTH_SHORT).show();
                    }
                });

                return content_highlight;
            }
        });

        /*
         * Mendapatkan kategori konten
         */
        RecyclerView categoriesContainer = view.findViewById(R.id.categories_container);
        categoriesContainer.setNestedScrollingEnabled(false);
        categoriesContainer.setLayoutManager(new LinearLayoutManager(getActivity()));
        categoriesContainer.setAdapter(new ExploreCategoryAdapter(
                new ArrayList<ExploreCategoryModel>() {{
                    add(new ExploreCategoryModel(
                            "Social Engineering",
                            new ArrayList<ExploreSubcategoryModel>() {{
                                add(new ExploreSubcategoryModel("Subcategory 1"));
                                add(new ExploreSubcategoryModel("Subcategory 2"));
                                add(new ExploreSubcategoryModel("Subcategory 3"));
                                add(new ExploreSubcategoryModel("Subcategory 4"));
                                add(new ExploreSubcategoryModel("Subcategory 5"));
                            }}
                    ));
                    add(new ExploreCategoryModel(
                            "Math",
                            new ArrayList<ExploreSubcategoryModel>() {{
                                add(new ExploreSubcategoryModel("Subcategory 6"));
                                add(new ExploreSubcategoryModel("Subcategory 7"));
                                add(new ExploreSubcategoryModel("Subcategory 8"));
                                add(new ExploreSubcategoryModel("Subcategory 9"));
                                add(new ExploreSubcategoryModel("Subcategory 10"));
                            }}
                    ));
                    add(new ExploreCategoryModel(
                            "Biology",
                            new ArrayList<ExploreSubcategoryModel>() {{
                                add(new ExploreSubcategoryModel("Subcategory 11"));
                                add(new ExploreSubcategoryModel("Subcategory 12"));
                                add(new ExploreSubcategoryModel("Subcategory 13"));
                                add(new ExploreSubcategoryModel("Subcategory 14"));
                                add(new ExploreSubcategoryModel("Subcategory 15"));
                            }}
                    ));
                    add(new ExploreCategoryModel(
                            "Physics",
                            new ArrayList<ExploreSubcategoryModel>() {{
                                add(new ExploreSubcategoryModel("Subcategory 1"));
                                add(new ExploreSubcategoryModel("Subcategory 2"));
                                add(new ExploreSubcategoryModel("Subcategory 3"));
                                add(new ExploreSubcategoryModel("Subcategory 4"));
                                add(new ExploreSubcategoryModel("Subcategory 5"));
                            }}
                    ));
                    add(new ExploreCategoryModel(
                            "Chemistry",
                            new ArrayList<ExploreSubcategoryModel>() {{
                                add(new ExploreSubcategoryModel("Subcategory 6"));
                                add(new ExploreSubcategoryModel("Subcategory 7"));
                                add(new ExploreSubcategoryModel("Subcategory 8"));
                                add(new ExploreSubcategoryModel("Subcategory 9"));
                                add(new ExploreSubcategoryModel("Subcategory 10"));
                            }}
                    ));
                    add(new ExploreCategoryModel(
                            "English",
                            new ArrayList<ExploreSubcategoryModel>() {{
                                add(new ExploreSubcategoryModel("Subcategory 11"));
                                add(new ExploreSubcategoryModel("Subcategory 12"));
                                add(new ExploreSubcategoryModel("Subcategory 13"));
                                add(new ExploreSubcategoryModel("Subcategory 14"));
                                add(new ExploreSubcategoryModel("Subcategory 15"));
                            }}
                    ));
                }},
                getActivity()
        ));

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    /*
     * Copied from https://gist.github.com/KKorvin/219555d4d3ee1828d7b0e808aad82930
     */
    public static int getDominantColor(Bitmap bitmap) {
        List<Palette.Swatch> swatchesTemp = Palette.from(bitmap).generate().getSwatches();
        List<Palette.Swatch> swatches = new ArrayList<>(swatchesTemp);
        Collections.sort(swatches, new Comparator<Palette.Swatch>() {
            @Override
            public int compare(Palette.Swatch swatch1, Palette.Swatch swatch2) {
                return swatch2.getPopulation() - swatch1.getPopulation();
            }
        });
        return swatches.size() > 2 ? swatches.get(2).getRgb() : swatches.get(0).getRgb();
    }

    /*
     * Copied from https://stackoverflow.com/a/15319676/8791891
     */
    @ColorInt
    public static int adjustAlpha(@ColorInt int color, float factor) {
        int alpha = Math.round(Color.alpha(color) * factor);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        return Color.argb(alpha, red, green, blue);
    }
}
